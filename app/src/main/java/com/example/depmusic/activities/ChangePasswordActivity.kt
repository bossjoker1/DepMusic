package com.example.depmusic.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depmusic.R

class ChangePasswordActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)
        initView()
    }

    private fun initView(){
        initNavBar(true, "修改密码" , false)
    }
}