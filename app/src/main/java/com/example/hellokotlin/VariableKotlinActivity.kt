package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.text = "Button clicks : " + clickCount // "Button clicks : $(clickCount)"

        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.text ="Activity start time : " +(timeText) // txtActivityStartTime.text ="Activity start time : $(timeText)"
    }
}