package com.example.employeecard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.employeecard.databinding.ActivityEmployeeCardBinding
import java.net.URL

class EmployeeCardActivity : AppCompatActivity() {
    private lateinit var achievementAdapter: AchievementAdapter
    private val testEmployee: TestEmployee = TestEmployee()
    private lateinit var phoneNumber: String
    private lateinit var binding: ActivityEmployeeCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Карточка сотрудника"
        achievementAdapter = AchievementAdapter()
        achievementAdapter.setList(testEmployee.achievements)
        setEmployeeInfo(testEmployee)

        with(binding) {
            recycleAchievements.layoutManager =
                LinearLayoutManager(
                    this@EmployeeCardActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            recycleAchievements.adapter = achievementAdapter
            phoneNumber = employeePhoneNumber.text.toString()

            buttonCallEmployee.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(intent)
            }
            buttonSendMessage.setOnClickListener {
                val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
                startActivity(intent)
            }
        }
    }

    private fun setEmployeeInfo(employee: TestEmployee) {
        with(binding) {
            employeeFullName.text = employee.fullName
            employeePhoto.setImageResource(employee.photo)
            employeePosition.text = employee.position
            employeeEmail.text = employee.email
            employeePhoneNumber.text = employee.phoneNumber
            employeeDescription.text = employee.description
            works.text = employee.worksStatus
            workExperience.text = employee.workExperience
        }
    }
}