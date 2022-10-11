package com.bignerdranch.android.izotov_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)

        val b1 = findViewById<Button>(R.id.button)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)



        b1.setOnClickListener {
            toast.show()
        }
        b2.setOnClickListener {
            count++
            if(count >= 2)
            {
                toast.show()
                count = 0
            }
        }
        b3.setOnClickListener {
            count++
            if(count >= 3)
            {
                toast.show()
                count = 0
            }
        }
    }
}