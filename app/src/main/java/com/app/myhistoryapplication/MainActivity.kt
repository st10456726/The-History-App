package com.app.myhistoryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // I got this information on GitHub.
//      // https://www.youtube.com/watch?v=g550IAzxQew
        btnClear.setOnClickListener {
            etAge.clear()
            val Disappear = ""
            tvResult.text = Disappear
        }

        btnGenerate.setOnClickListener {
            var message: String = ""

            if (etAge.toString().toInt() == 21) {
                message =
                    "You are 21 years old, which is the same age as Juice World when he passed away. Juice World was a famous rapper"
            } else if (etAge.toString().toInt() == 32) {
                message =
                    "You are the same age as Misty Upham, who passed she away at the age of 32. Misty Upham was a famous actress"
            } else if (etAge.toString().toInt() == 46) {
                message =
                    "You are the same age as Henry IV of England when he passed away. Henry was the King of England unfortunately he passed away when he was 46 years of age"
            } else if (etAge.toString().toInt() == 53) {
                message =
                    "You are the same age as Freddie Mercury when he passed away. Freddie Mercury was one of the greatest Rock singers, he passed away at the age of 53"
            } else if (etAge.toString().toInt() == 60) {
                message =
                    "You are the same age as Theodore Roosevelt when he passed away. Theodore Roosevelt was the President of United States from 1901-1909"
            } else if (etAge.toString().toInt() == 75) {
                message =
                    "You are the same age as Penny Marshall when she passed away. Penny Marshall was 75 when she passed away and she was a famous actress"
            } else if (etAge.toString().toInt() == 91) {
                message =
                    "You are 91 years old, which is the same age as Winston Churchill when he passed away. Winston was a Prime Minister of UK in 1940-1955"
            } else if (etAge.toString().toInt() == 25) {
                message =
                    "You are 25, you are the same age as Tupac Shakur when he passed away. Tupac was the greatest American rapper"
            }else if (etAge.toString().toInt() == 39) {
                message =
                    "You are 39, which is the same age as Chris Kyle when he passed away. Kyle was a US Navy SEAL sniper"
            }else if (etAge.toString().toInt() == 42) {
                message = "You are 42, which is the same age as Albert Prince Consort. Albert was the Prince of Consort of Queen Victoria of Great Britain"
            }else if (etAge.toString().toInt() == 100) {
                message =
                    "You are the same age as Gloria Stuart when she passed away. Gloria was an actress and passed away at the age of 100 "
            } else {
                message = "You gave the wrong age. This application can not generate your age "
            }
            if(etAge.toString().toInt() > 20 && etAge.toString().toInt() < 100)
            tvResult.text = "Your age is not within the range"
            // I used CodeProject to help understand what to do.
            // https://www.codeproject.com/Questions/5354442/How-to-input-D-O-B-and-getting-age-using-kotlin-an


            tvResult.text = "Hi, ${message}"
        }

    }
}