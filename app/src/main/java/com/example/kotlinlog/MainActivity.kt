package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
        1 -> Log.d("kotlintest", "紅茶を注文しました")
        2 -> Log.d("kotlintest", "ミルクを注文しました")
        else -> Log.d("kotlintest", "オーダーミスです")
        }

}
}