package com.example.a13042022_password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_zat = findViewById<Button>(R.id.btnZatwierdz) as Button
        var btn_spr = findViewById<Button>(R.id.btnSpr) as Button
        var haslo1 = findViewById<EditText>(R.id.haslo1) as EditText
        var haslo2 = findViewById<EditText>(R.id.haslo2) as EditText
        var btnwidok1 = findViewById<Button>(R.id.btnWidok1) as Button
        var btnwidok2 = findViewById<Button>(R.id.btnWidok2) as Button

        var haslo = ""
        btn_zat.setOnClickListener {
            haslo = haslo1.text.toString();
            val text = Toast.makeText(applicationContext , "Haslo zostalo zaspisane", Toast.LENGTH_SHORT)
            text.show()
        }

        btn_spr.setOnClickListener {
            val sprhaslo = haslo2.text;
            if (sprhaslo.toString() == haslo){
              val text1 = Toast.makeText(applicationContext, "Hasla sa zgodne", Toast.LENGTH_SHORT)
              text1.show()
            }
            else {
                val text2 = Toast.makeText(applicationContext, "Hasla nie sa zgodne", Toast.LENGTH_SHORT)
                text2.show()
            }
        }
        btnwidok1.setOnClickListener {

        }
    }
}