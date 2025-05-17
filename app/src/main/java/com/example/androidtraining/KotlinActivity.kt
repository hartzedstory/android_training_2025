package com.example.androidtraining

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    val count = 0;
    var count1 = 0;

    // Bien khong gan gia tri mac dinh
    var count2: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_kotlin)
        TestClass("asdasd",12)
        val a = TestClass().apply {

        }
    }

    // Ham khong tra ve gia tri
    private fun demoFuntion(giatri: Int) {

    }

    //Ham tra ve gia tri
    private fun demoFunction2(giatri: Int): Int {
        return giatri
    }
}