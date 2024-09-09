package com.quizapp.ui.prepare

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.quizapp.R
import com.quizapp.databinding.ActivityPrepareBinding

class PrepareActivity : AppCompatActivity() {

    private lateinit var prepareBinding: ActivityPrepareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prepareBinding = ActivityPrepareBinding.inflate(layoutInflater)
        setContentView(prepareBinding.root)
    }
}