package com.example.mingdemo.kotlindsl

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.View

class DslView(context:Context) : View(context) {
    var color = Color.WHITE
    companion object {
        fun create(activity: Activity, block: DslView.() -> Unit) {

        }
    }

    fun color(block: DslView.() -> Unit) {
        block
    }

}