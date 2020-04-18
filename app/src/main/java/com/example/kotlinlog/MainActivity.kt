package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //ここを追加

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)

        //レイアウトファイルを設定する
        setContentView(R.layout.activity_main)

        /*
        複数行に
        渡る
        コメントを
        記述できる
         */

        Log.d("kotlintest", "ログへの出力テスト")   //ここを追加
    }
}