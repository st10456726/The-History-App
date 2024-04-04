package com.app.myhistoryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInsructions = findViewById<EditText>(R.id.etInstruction)
        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<EditText>(R.id.tvResult)

        btnGenerate.setOnClickListener {
            var message: String = ""

            if (etAge.toString().equals("Age21")){
                message = "For ${etAge.toString()} : You are 21 years old, which is the same age as Juice World when he passed away. Juice World was a famous rapper"
            }else if (etAge.toString().equals("Age32")){
                message = "For ${etAge.toString()} : You are the same age as Misty Upham, who passed she away at the age of 32. Misty Upham was a famous actress"
            }else if (etAge.toString().equals("Age 46")){
                message = "For ${etAge.toString()} : You are the same age as Henry IV of England when he passed away. Henry was the King of England unfortunately he passed away when he was 46 years of age"
            }else if (etAge.toString().equals("Age53")){
                message = "For ${etAge.toString()} : You are the same age as Freddie Mercury when he passed away. Freddie Mercury was one of the greatest Rock singers, he passed away at the age of 53"
            }else if (etAge.toString().equals("Age60")){
                message = "For ${etAge.toString()} : You are the same age as Theodore Roosevelt when he passed away. Theodore Roosevelt was the President of United States from 1901-1909"
            }else if (etAge.toString().equals("Age75")){
                message = "For ${etAge.toString()} : You are the same age as Penny Marshall when she passed away. Penny Marshall was 75 when she passed away and she was a famous actress"
            }else if (etAge.toString().equals("Age91")){
                message = "For ${etAge.toString()} : You are 91 years old, which is the same age as Winston Churchill when he passed away. Winston was a Prime Minister of UK in 1940-1955"
            }else{
                message = "You gave the wrong age. This application can not generate your age "
            }

            tvResult.text = "Hi ${etAge}, ${message}"

    }
}