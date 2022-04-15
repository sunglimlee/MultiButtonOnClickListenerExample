package com.example.multibuttononclicklistenerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.lang.reflect.Array

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttons = arrayOf<Button>(
            Button(this), //dummy button
            findViewById(R.id.button1,),
            findViewById(R.id.button2),
            findViewById(R.id.button3),
            findViewById(R.id.button4),
            findViewById(R.id.button5),
            findViewById(R.id.button6),
            findViewById(R.id.button7),
            findViewById(R.id.button8),
            findViewById(R.id.button9),
            findViewById(R.id.button10),
            findViewById(R.id.button11)
        )
        for (i in 1..11) {
            buttons[i].setOnClickListener(this)
        }

    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "${(p0 as Button).text} clicked.", Toast.LENGTH_SHORT).show()
    }
}