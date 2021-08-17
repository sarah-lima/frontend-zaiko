package com.example.projeto_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.one_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable
        {
            setContentView(R.layout.one_view)
        }, 3000
        )
        setContentView(R.layout.one_view)
        val primeiroAcesso = button2
        primeiroAcesso.setOnClickListener {
            setContentView(R.layout.one_view_2)
        }
        
    }
}