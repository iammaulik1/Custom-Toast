package com.example.a4customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)

        val linearLayout = null
        val layout= layoutInflater.inflate(R.layout.customtoast,linearLayout)
        button.setOnClickListener(){
            val myToast = Toast(applicationContext)
            myToast.duration= Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            myToast.view = layout
            myToast.show()
        }
    }
}