package com.quizapp.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quizapp.R
import com.quizapp.databinding.ActivityMainBinding
import com.quizapp.ui.prepare.PrepareActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        onClick()
    }

    private fun onClick() {
        mainBinding.btnPlay.setOnClickListener {
            val intent = Intent(this, PrepareActivity::class.java)
            startActivity(intent)
        }
    }
}
