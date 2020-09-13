package com.example.depmusic.activities

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.example.depmusic.R


open class BaseActivity:AppCompatActivity() {

    private var mIvBack: ImageView? = null
    private var mIvMe:ImageView? = null
    private var mTvTitle: TextView? = null

    protected open fun <T : View?> fd(@IdRes id: Int): T {
        return findViewById<T>(id)
    }

    /**
     * 初始化navigationBar
     */
    protected open fun initNavBar(
        isShowBack: Boolean,
        title: String?,
        isShowMe: Boolean
    ) {
        mIvBack = fd(R.id.iv_back)
        mTvTitle = fd(R.id.tv_title)
        mIvMe = fd(R.id.iv_me)
        mIvBack!!.visibility = if (isShowBack) View.VISIBLE else View.GONE
        mIvMe!!.visibility = if (isShowMe) View.VISIBLE else View.GONE
        mTvTitle!!.text = title
        mIvBack!!.setOnClickListener { onBackPressed() }
        mIvMe!!.setOnClickListener{
            var intent= Intent(this,MeActivity::class.java)
            startActivity(intent)
        }
    }
}