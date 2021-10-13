package com.example.projeto_android

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable
        {
            startActivity(Intent(this@MainActivity, ProductActivity::class.java))

//            setContentView(R.layout.activity_splash_one)
//            val btnOne: Button = findViewById(R.id.btn_one)
//            btnOne.setBackgroundColor(Color.parseColor("#7BAF8D"))
//            buttons()

        }, 3000
        )
    }
    fun buttons(){
        val btnOne:Button = findViewById(R.id.btn_one)
        val btnTwo:Button = findViewById(R.id.btn_two)
        val btnTree:Button = findViewById(R.id.btn_tree)
        val btnFour:Button = findViewById(R.id.btn_four)
        val btnFive:Button = findViewById(R.id.btn_five)
        val btnSix:Button = findViewById(R.id.btn_six)
        val btnSeven:Button = findViewById(R.id.btn_seven)
        val btnEight:Button = findViewById(R.id.btn_heigt)
        btnOne.setOnClickListener {
            btnOne.setBackgroundColor(Color.parseColor("#7BAF8D"))
            btnTwo.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTree.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFour.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFive.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSix.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSeven.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnEight.setBackgroundColor(Color.parseColor("#FFFFFF"))

            setContentView(R.layout.activity_splash)
        }
        btnTwo.setOnClickListener {
            btnOne.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTwo.setBackgroundColor(Color.parseColor("#7BAF8D"))
            btnTree.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFour.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFive.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSix.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSeven.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnEight.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        btnTree.setOnClickListener {
            btnOne.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTwo.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTree.setBackgroundColor(Color.parseColor("#7BAF8D"))
            btnFour.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFive.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSix.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSeven.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnEight.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        btnFour.setOnClickListener {
            btnOne.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTwo.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTree.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFour.setBackgroundColor(Color.parseColor("#7BAF8D"))
            btnFive.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSix.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSeven.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnEight.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        btnFive.setOnClickListener {
            btnOne.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTwo.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnTree.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFour.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnFive.setBackgroundColor(Color.parseColor("#7BAF8D"))
            btnSix.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnSeven.setBackgroundColor(Color.parseColor("#FFFFFF"))
            btnEight.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }

    }
}