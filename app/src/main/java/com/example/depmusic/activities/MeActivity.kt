package com.example.depmusic.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.depmusic.R
import com.example.depmusic.utils.UserUtils
import kotlinx.android.synthetic.main.activity_me.*

class MeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me)
        initView()
        onLogoutClick.setOnClickListener{
            UserUtils.logout(this)
        }
    }

    private fun initView(){
        initNavBar(true,"个人中心",false)

    }

    /**
     * 修改密码
     */

    public fun onChangeClick(v: View){
        val intent = Intent(this,ChangePasswordActivity::class.java)
        startActivity(intent)
    }

}