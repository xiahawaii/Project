package me.xia.project.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.xia.project.R

class WelcomeActivity : AppCompatActivity() {

    /**
     * 生命周期：onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_welcome)
    }
}
