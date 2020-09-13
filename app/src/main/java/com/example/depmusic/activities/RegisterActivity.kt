package com.example.depmusic.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depmusic.R

class RegisterActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initView()
    }

    /**
     * 初始化View
     */

    private fun initView(){
        initNavBar(true, "注册",false)
    }
}