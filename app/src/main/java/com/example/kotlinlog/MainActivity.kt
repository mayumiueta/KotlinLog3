package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)

for ( i in points) {
    Log.d("kotlintest", i. toString())
}
    }
}