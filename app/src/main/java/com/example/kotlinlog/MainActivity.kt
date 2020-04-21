package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //引数に100を指定してtotal関数を呼び出す
        total(100)
    }
    //lastという名前のInt型の引数を指定する
        private fun total(last: Int) {
        var sum = 0
        for ( i in 1..last)  {
            sum += i
        }
        Log.d ("kotlintest", sum.toString())
}
}