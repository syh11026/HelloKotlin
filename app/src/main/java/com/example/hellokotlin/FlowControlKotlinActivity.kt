package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FlowControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_flowcontrol)

        val btnLD = findViewById<Button>(R.id.btnLD)
        val fieldNumber = findViewById<EditText>(R.id.fieldNumber)
        btnLD.setOnClickListener {
            val number = fieldNumber.text.toString().toInt()

            if(number % 2 == 0){
                Toast.makeText(applicationContext, "${number}은(는) 2의 배수",Toast.LENGTH_SHORT).show()
            }else if(number % 3 == 0){
                Toast.makeText(applicationContext, "${number}은(는) 3의 배수",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "${number}은(는) else",Toast.LENGTH_SHORT).show()
            }

            when (number){
                4,9 -> btnLD.text = "실행 for " + number
                else -> btnLD.text = "실행 for else"

            }
        }

    }
}