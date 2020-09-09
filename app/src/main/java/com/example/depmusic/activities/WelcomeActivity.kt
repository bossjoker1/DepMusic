package com.example.depmusic.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.depmusic.R
import java.util.*


class WelcomeActivity : BaseActivity() {
    private lateinit var mTimer:Timer;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        init()
    }

    private fun init(){
        mTimer = Timer()
        mTimer.schedule(object : TimerTask() {
            override fun run() {
                Log.d("WelcomeActivity", "当前线程为 :" + Thread.currentThread());
               // toMain();
                toLogin();
            }
        }, 2 * 1000)
    }

    private fun toMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun toLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}