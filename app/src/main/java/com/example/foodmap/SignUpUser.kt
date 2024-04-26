package com.example.foodmap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.foodmap.databinding.ActivitySignUpUserBinding

class SignUpUser : AppCompatActivity() {

    private lateinit var goLoginPage : AppCompatTextView
    private lateinit var goStartPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign_up_user)
        goLoginPage = findViewById(R.id.go_login_user_page)
        goLoginPage.setOnClickListener{
            val intent = Intent(this@SignUpUser, LoginActivity :: class.java)
            startActivity(intent)
        }
        goStartPage = findViewById(R.id.create_btn)
        goStartPage.setOnClickListener{
            val intent = Intent(this@SignUpUser, MainActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}