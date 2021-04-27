package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var btnHello : Button
//    val btnHello 초기화 필요

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello =findViewById<Button>(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity,"Hello Kotlin", Toast.LENGTH_LONG).show()
        }

    }
}