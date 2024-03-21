package com.example.foodmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class StartActivity : AppCompatActivity() {
    //для поиска кнопки перехода
    private lateinit var goLoginPage : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        goLoginPage = findViewById(R.id.do_user_login_btn)

        //переход на страницу регистрации по нажатию кнопки
        goLoginPage.setOnClickListener{
            val intent = Intent(this@StartActivity, LoginActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}
