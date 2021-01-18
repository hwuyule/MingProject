package com.example.mingdemo.kotlindsl

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mingdemo.R

class DslTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsl_test)
        DslView.create(this){
            color {
                color = Color.RED
            }
        }
    }
}
