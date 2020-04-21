package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //引数に50と1000を指定してtotal関数を呼び出す
        total(50, 1000)

        //引数の値をかえることで処理内容を簡単に変更できる
        total(1, 1111)
    }

    //firstとlast、２つの引数を指定する
        private fun total(first: Int, last: Int) {
        var sum = 0
        for ( i in first..last)  {
            sum += i
        }
        Log.d ("kotlintest", sum.toString())
}
}