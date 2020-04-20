package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // １から３まで（３を含む）
for ( i in 1..3) {
    Log.d("kotlintest", "..演算子の"  + i + "の回" )
}
        // ６から２飛ばしずつ０まで
    for ( i in 6 downTo 0 step 2) {
        Log.d("kotlintest", "downTo関数の"  + i + "の回" )
}
    }
}