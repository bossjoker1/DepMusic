package com.example.depmusic.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.depmusic.R
import com.example.depmusic.utils.UserUtils
import com.example.depmusic.views.InputView

class LoginActivity : BaseActivity() {

    private var mInputPhone: InputView? = null
    private  var mInputPassword:InputView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }

    private fun initView(){
        initNavBar(false,"登录",false)

        mInputPhone = fd(R.id.input_phone)
        mInputPassword = fd(R.id.input_password)
    }

    /**
     * 跳转注册页面点击事件
     */
    public fun onRegisterClick(v:View){
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

    /**
     * 登录按钮点击事件
     */
    public fun onCommitClick(v:View){
        val phone = mInputPhone!!.inputStr
        val password = mInputPassword!!.inputStr
        //验证输入是否合法

        if(!UserUtils.validateLogin(this, phone, password)){
            return;
        }
        //跳转到主页面
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}