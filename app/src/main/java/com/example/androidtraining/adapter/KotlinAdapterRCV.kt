package com.example.androidtraining.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.R
import com.example.androidtraining.entity.Student
import org.w3c.dom.Text

class KotlinAdapterRCV(var studentList: MutableList<Student>): RecyclerView.Adapter<KotlinAdapterRCV.KotlinAdapterViewHolder>() {

    //B1: Khai bao ViewHolder va cac truong hung du lieu tuong ung trong file layout
    inner class KotlinAdapterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.kotlinItemName)
        val tvAge: TextView = itemView.findViewById(R.id.kotlinItemAge)
    }

    //B2: Override lai cac ham
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KotlinAdapterViewHolder {
        //B3: Khoi tao viewholder bang file item da tao san xml
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kotlin_item_student, parent, false)
        return KotlinAdapterViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: KotlinAdapterViewHolder,
        position: Int
    ) {
        //B4: Gan du lieu va tung truong da khai bao
        val studentItem = studentList[position]
        holder.tvName.text = studentItem.name
        holder.tvAge.text = (studentItem.age).toString()
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

}