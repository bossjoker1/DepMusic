package com.example.depmusic.activities

import android.os.Bundle
import com.example.depmusic.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        initNavBar(false, "网抑云", true)
    }
}