package com.example.madpractical2_21012022048

import android.graphics.Color.WHITE
import android.graphics.Color.colorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity()
{
        private lateinit var btnSnackBar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{

           Snackbar.make(button,"onResume function called",Snackbar.LENGTH_LONG)
               .setAction("cancel"){

               }
               .show()


            //This is for toast message
            //Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
        }
    }

}