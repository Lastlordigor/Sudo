package com.example.myfirsttry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.app.Activity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myTextView = findViewById<TextView>(R.id.textView);
        myTextView.setText("dbskk")

    }
    fun ToastMe(view:View){
        val myToast=Toast.makeText(this,"Похоже вы хороший командир!",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun krum(view:View) {
        val myToast = Toast.makeText(this, "Крым наш и все османы сбежали", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun bol(view:View){
        val myToast=Toast.makeText(this,"you make to bolgariya judjment cut",Toast.LENGTH_SHORT)
        myToast.show()
}   }


