package com.example.androidtraining

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.adapter.KotlinAdapterRCV
import com.example.androidtraining.adapter.SecondKotlinAdapter
import com.example.androidtraining.entity.Student

class KotlinActivity : AppCompatActivity() {
    val count = 0;
    var count1 = 0;
    // Bien khong gan gia tri mac dinh
    var count2: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_kotlin)
        this.configRecycleView()
    }

    // Ham khong tra ve gia tri
    private fun demoFuntion(giatri: Int) {

    }

    //Ham tra ve gia tri
    private fun demoFunction2(giatri: Int): Int {
        return giatri
    }

    internal fun createList(): MutableList<Student> {
        val studentList: MutableList<Student> = ArrayList<Student>()
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        studentList.add(Student("Duc Nguyen", 24, "002", "HN"))
        return studentList
    }
}

fun KotlinActivity.configRecycleView() {
    val recyclerView = findViewById<RecyclerView>(R.id.kotlinRecycleView)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = SecondKotlinAdapter(createList())
}