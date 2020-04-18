package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //ここを追加

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        //numに50を代入する
        //変数や定数に　.toString()を記述するほうほうもある
        num = 50
        Log.d("kotlintest", num. toString())

    }
}