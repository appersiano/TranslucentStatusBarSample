package com.appersiano.transparentstatusbar

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager


class MainActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTrasparentStatusBar()
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setTrasparentStatusBar() {
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        window.statusBarColor = ContextCompat.getColor(this, R.color.transparentSatusBar)

        window.navigationBarColor = ContextCompat.getColor(this, android.R.color.black)
    }
}