package com.example.projeto_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.buttonlayout.*
import kotlinx.android.synthetic.main.one_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable
        {
            setContentView(R.layout.one_view)
            continuacao()
        }, 3000
        )

        
    }
    fun continuacao(){
        val segundoTut = button2
        val tercTut = button3
        val quartTut = button4
        val quintTut = button5
        segundoTut.setOnClickListener {
            setContentView(R.layout.one_view_2)
            continuacao()
        }
        tercTut.setOnClickListener {
            setContentView(R.layout.one_view)
            continuacao()
        }
    }
}