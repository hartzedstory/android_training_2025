package com.example.androidtraining.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtraining.R;
import com.example.androidtraining.entity.Student;

import org.w3c.dom.Text;

import java.util.List;

public class SecondAdapterRCV extends RecyclerView.Adapter<SecondAdapterRCV.SecondAdapterViewHolder> {
    private List<Student> studentList;

    public SecondAdapterRCV(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public SecondAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new SecondAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }


    public class SecondAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tvAge;
        public SecondAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvUserName);
            tvAge = itemView.findViewById(R.id.tvUserAge);
        }
    }
}
