package com.example.mingdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout

/**
 * TransitionManager简单使用
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root = findViewById<ViewGroup>(R.id.root)
        val icon = findViewById<View>(R.id.icon)
        icon.setOnClickListener {
            v ->
            TransitionManager.beginDelayedTransition(root)
            val params = v.layoutParams as LinearLayout.LayoutParams
            params.height *= 2
            params.width *= 2
            params.gravity = Gravity.CENTER
            v.layoutParams = params
        }

    }
}
