package com.example.projeto_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.buttonlayout.*
import kotlinx.android.synthetic.main.one_view.*

class TutorialView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.one_view)

        val segundoTut = button2
        val tercTut = button3
        val quartTut = button4
        val quintTut = button5
        segundoTut.setOnClickListener {
            setContentView(R.layout.one_view_2)
        }
        tercTut.setOnClickListener {
            setContentView(R.layout.one_view)
        }
    }
}