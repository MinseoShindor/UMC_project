package com.example.umc_project


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_project.databinding.ActivityManagerMenuBinding

class ManagerMenu : AppCompatActivity() {
    lateinit var binding : ActivityManagerMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_menu)

        binding.managerDepartureRegBtn.setOnClickListener {
            startActivity(Intent(this, managerCalendar::class.java))
        }
    }
}