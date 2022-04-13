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


        btn_zat.setOnClickListener {
            val haslo = haslo1.text;
            val text = Toast.makeText(applicationContext , "Haslo zostalo zaspisane", Toast.LENGTH_SHORT)
            text.show()
        }
    }
}