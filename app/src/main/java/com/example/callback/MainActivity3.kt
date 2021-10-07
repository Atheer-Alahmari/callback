package com.example.callback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Toast.makeText(applicationContext, "On start activity3 ", Toast.LENGTH_SHORT).show()

    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "Onresume activity3", Toast.LENGTH_SHORT).show()

    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "Ondestroy activity3", Toast.LENGTH_SHORT).show()
    }
}