package com.example.mingdemo

import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class EntranceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrance)

        val linearLayout = findViewById<LinearLayout>(R.id.root)

        /**
         * 学习一下这个写demo的方法，迅速写多个Activity的入口 测试
         */
        packageManager.getPackageInfo(
            packageName, PackageManager.GET_ACTIVITIES).activities.forEach { activity ->
            if (activity.name == this::class.java.name) {
                return@forEach
            }

            val clazz = Class.forName(activity.name)

            val button = Button(this).apply {
                isAllCaps = false
                text = clazz.simpleName
                setOnClickListener {
                    startActivity(Intent(this@EntranceActivity, clazz))
                }
            }
            linearLayout.addView(button)
        }
    }
}
