package com.example.androidtraining.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtraining.R;
import com.example.androidtraining.entity.Student;

import java.util.List;

// Hiển thị danh sách hoc sinh trong lop
public class AdapterRCV extends RecyclerView.Adapter<AdapterRCV.AdapterRCVViewHolder> {
    private List<Student> studentList;
    private OnItemClick onItemClick;

    //C1: Tạo adapter bằng constructor
    public AdapterRCV(List<Student> list) {
        this.studentList = list;
    }

    //C2: Dùng hàm Getter/Setter

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    //Tạo ra item (viewHolder là 1 view để giữ data)
    @Override
    public AdapterRCVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Khoi tao ra mot viewHolder bang cach inflate
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new AdapterRCVViewHolder(view);
    }

    //Set dữ liệu vào viewHolder
    @Override
    public void onBindViewHolder(@NonNull AdapterRCVViewHolder holder, int position) {
        holder.tvUserName.setText(studentList.get(position).getName() + "");
        holder.tvUserAge.setText(studentList.get(position).getAge().toString());
        holder.tvUserName.setOnClickListener(view -> {
            onItemClick.clickName(studentList.get(position).getName().toString());
        });


        holder.itemView.setOnClickListener(view -> {
            onItemClick.clickItem();
        });
    }

    //Hiển thị số lượng item mong muốn
    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class AdapterRCVViewHolder extends RecyclerView.ViewHolder {
        private TextView tvUserName;
        private TextView tvUserAge;
        public AdapterRCVViewHolder(@NonNull View item) {
            super(item);
            tvUserName = item.findViewById(R.id.tvUserName);
            tvUserAge = item.findViewById(R.id.tvUserAge);
        }
    }

    public interface OnItemClick {
        void clickName(String name);
        void clickAge(String age);
        void clickItem();
    }
}
