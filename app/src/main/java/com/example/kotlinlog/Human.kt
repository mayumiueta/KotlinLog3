package com.example.kotlinlog

import android.util.Log

open class Human: Animal {
    constructor(name: String, age: Int): super(name, age) {
    }
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }
}