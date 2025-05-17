package com.example.androidtraining

class TestClass: TestClass2(), iClass {
    var name: String? = null
    var age: Int? = null

    override fun doSum() {
        super.doSum()
    }

    override fun hienThiThongTin() {
        TODO("Not yet implemented")
    }
}

open class TestClass2: TestClass3() {
    open fun doSum() {

    }

    override fun doDivide() {
        super.doDivide()
    }
}

abstract class TestClass3 {
    open fun doDivide() {

    }
}

interface iClass {
    fun hienThiThongTin();
}