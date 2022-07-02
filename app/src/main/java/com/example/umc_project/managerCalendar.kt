package com.example.umc_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.DatePickerDialog
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import com.example.umc_project.databinding.ActivityManagerCalendarBinding


import java.util.*

class managerCalendar : AppCompatActivity() {
    lateinit var binding : ActivityManagerCalendarBinding
    var dateString = ""

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_calendar)

        binding.date.setOnClickListener {
            val cal = Calendar.getInstance()
            val dateSetListener =
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    dateString = "${year}년 ${month + 1}월 ${dayOfMonth}일"
//                    result.text = "날짜 : " + dateString
                     }
            DatePickerDialog(
                this,
                dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

    }
}