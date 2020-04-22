package com.example.kotlinlog

import android.util.Log

class Dog {
    //プロパティ
    var name: String
    var age: Int

    //引数つきコンストラクタ
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    //メソッド
    fun say(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「わんわん」")
    }
}