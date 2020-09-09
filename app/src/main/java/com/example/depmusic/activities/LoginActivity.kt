package com.example.depmusic.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depmusic.R

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }

    private fun initView(){
        initNavBar(false,"登录",false)
    }
}