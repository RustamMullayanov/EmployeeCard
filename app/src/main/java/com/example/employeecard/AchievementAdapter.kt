package com.example.employeecard

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.employeecard.databinding.AchievementItemBinding


class AchievementAdapter : RecyclerView.Adapter<AchievementAdapter.AchievementHolder>() {
    private var achievements: List<Achievement> = emptyList()

    class AchievementHolder(val viewBinding: AchievementItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementHolder {
        val binding = AchievementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AchievementHolder(binding)
    }

    override fun onBindViewHolder(holder: AchievementHolder, position: Int) {
        val item = achievements[position]
        with(holder.viewBinding){
            achievementName.text = item.name
            achievementImage.setImageResource(item.imageId)
        }
    }

    override fun getItemCount(): Int {
        return achievements.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Achievement>) {
        achievements = list
        notifyDataSetChanged()
    }
}