package com.example.employeecard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEmployeeCard = findViewById<Button>(R.id.button_employee_card)

        buttonEmployeeCard.setOnClickListener {
            goEmployeeCard()
        }
    }

    private fun goEmployeeCard() {
        val intent = Intent(this, EmployeeCardActivity::class.java)
        startActivity(intent)
    }
}