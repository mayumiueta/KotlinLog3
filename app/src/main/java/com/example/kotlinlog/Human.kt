package com.example.kotlinlog

import android.util.Log

open class Human: Animal {
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say(){
     Log.d("kotlintest", this.name + this.age)
}