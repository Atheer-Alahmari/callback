package com.example.callback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(applicationContext, "On start activity2 ", Toast.LENGTH_SHORT).show()

    }

    fun newpage(view: View) {
        var info= Intent(this,MainActivity3::class.java)

        startActivity(info)

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "Onresume activity2", Toast.LENGTH_SHORT).show()

    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "Ondestroy activity2", Toast.LENGTH_SHORT).show()
    }


}