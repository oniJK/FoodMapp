package com.example.foodmap

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.example.foodmap.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var goSignPage : AppCompatTextView
    private lateinit var goStartPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        goSignPage = findViewById(R.id.go_sign_up_user)
        goSignPage.setOnClickListener{
            val intent = Intent(this@LoginActivity, SignUpUser :: class.java)
            startActivity(intent)
        }
        goStartPage = findViewById(R.id.login_btn)
        goStartPage.setOnClickListener{
            val intent = Intent(this@LoginActivity, MainActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}