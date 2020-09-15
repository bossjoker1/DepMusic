package com.example.depmusic.activities

import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.depmusic.R
import com.example.depmusic.adapters.MusicGridAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val layoutManager = GridLayoutManager(this, 3)
        rv_grid.layoutManager = layoutManager
        val adapter = MusicGridAdapter(this)
        rv_grid.adapter = adapter

    }

    private fun initView(){
        initNavBar(false, "网抑云", true)
    }
}