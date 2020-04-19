package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i +  "回目")
        }

       var num = 1

    while (num < 6) {
        Log.d("kotlintest", "while文の" + num  +  "回目")
        num++
}
}
}