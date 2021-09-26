package com.example.excelso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_ButtonMain()
        click_ButtonRegister()


    }

    fun click_ButtonMain() {
        button.setOnClickListener() {
            val ventanaLogin: Intent =Intent(applicationContext, MenuExcelso::class.java)
            startActivity(ventanaLogin)
        }
    }

    fun click_ButtonRegister() {
        button2.setOnClickListener() {
            val ventanaRegister: Intent =Intent(applicationContext, Registro::class.java)
            startActivity(ventanaRegister)
        }
    }
}