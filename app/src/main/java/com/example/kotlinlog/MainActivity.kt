package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val dog = Dog("ポチ", 3)
             //名前をぽち、年齢3歳で、Dogのインスタンスを作る

               dog.say()
               //ぽちが吠えます（ログ出力)
        Log.d ("kotlintest", "犬の名前は"+ dog.name + "です")
               Log.d("kotlintest", "犬の年齢は"+ dog.age + "才です")

            val dog2 = Dog("ハチ", 10)
        //名前をハチ、年齢10歳で、Dogのインスタンスを作る
               dog2.say()
               //ハチが吠えます（ログ出力)
               Log.d ("kotlintest", "犬の名前は"+ dog2.name + "です")
        Log.d ("kotlintest", "犬の年齢は"+ dog2.age + "才です" )
    }
}