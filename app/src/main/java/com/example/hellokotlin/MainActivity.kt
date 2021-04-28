package com.example.hellokotlin

import android.content.Intent
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

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin =findViewById<Button>(R.id.btnKotlin)
        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)

        var intent : Intent

        btnJava.setOnClickListener {
          intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }
        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(intent)
        }
        btnVarJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }
        btnVarKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }

    }
}