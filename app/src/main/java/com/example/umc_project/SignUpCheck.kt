package com.example.umc_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_project.databinding.ActivitySignUpCheckBinding

class SignUpCheck : AppCompatActivity() {

    lateinit var binding: ActivitySignUpCheckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.VolunteerSignUpBtn.setOnClickListener {
            startActivity(Intent(this, SignUpVolunteer::class.java))
        }


    }
}