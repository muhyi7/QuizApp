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

        onClick()
    }

    private fun onClick() {
        prepareBinding.btnStart.setOnClickListener {
            val nickname = prepareBinding.etNickname.text.toString()
            if(checkValidation(nickname)){

            }
        }
    }

    private fun checkValidation(nickname: String): Boolean {
        return if (nickname.isEmpty()){
            prepareBinding.etNickname.error = getString(R.string.please_field_your_nickname)
            false
        }else{
            true
        }
    }
}