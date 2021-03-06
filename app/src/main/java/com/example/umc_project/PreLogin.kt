package com.example.umc_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.umc_project.databinding.ActivityPreLoginBinding

class PreLogin : AppCompatActivity() {
    lateinit var binding: ActivityPreLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_login)

        binding = ActivityPreLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.preLoginSignUpTv.setOnClickListener {
            startActivity(Intent(this, SignUpCheck::class.java))
        }

        binding.preLoginLoginBtn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        binding.managerView.setOnClickListener {
            startActivity(Intent(this, ManagerMenu::class.java))
        }

    }
}