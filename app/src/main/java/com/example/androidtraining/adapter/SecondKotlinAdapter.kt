package com.example.androidtraining.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtraining.R
import com.example.androidtraining.entity.Student

class SecondKotlinAdapter(var studentList: MutableList<Student>): RecyclerView.Adapter<SecondKotlinAdapter.SecondKotlinViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondKotlinViewHolder {
        //Khoi tao view holder va khai bao cac truong hung data
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kotlin_item_student, parent, false)
        return SecondKotlinViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SecondKotlinViewHolder,
        position: Int
    ) {
        //Gan du lieu vao trong view
        holder.tvName.text = studentList[position].name
        holder.tvAge.text = (studentList[position].age).toString()

    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    inner class SecondKotlinViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.kotlinItemName)
        val tvAge = itemView.findViewById<TextView>(R.id.kotlinItemAge)
    }
}