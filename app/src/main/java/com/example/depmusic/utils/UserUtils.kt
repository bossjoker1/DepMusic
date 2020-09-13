package com.example.depmusic.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.text.TextUtils
import android.widget.Toast
import com.blankj.utilcode.util.RegexUtils
import com.example.depmusic.R
import com.example.depmusic.activities.LoginActivity


object UserUtils {

      fun validateLogin(context: Context,phone:String,password:String): Boolean {
        if (!RegexUtils.isMobileExact(phone)){
            Toast.makeText(context,"无效手机号",Toast.LENGTH_SHORT).show()
            return false
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(context,"请输入密码", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    /**
     * 退出登录
     */
    public fun logout(context: Context){
        var intent = Intent(context,LoginActivity::class.java)
        //定义intent标识符
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
        //传入动画
        (context as Activity).overridePendingTransition(R.anim.open_enter, R.anim.open_exit)
    }

}