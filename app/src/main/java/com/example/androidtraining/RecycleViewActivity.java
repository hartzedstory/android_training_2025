package com.example.androidtraining;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtraining.adapter.AdapterRCV;
import com.example.androidtraining.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView tableView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycle_view);
        tableView = findViewById(R.id.tableView);

        //B1:
        //Khai bao adapter
        AdapterRCV adapterRCV = new AdapterRCV(createList());
        adapterRCV.setOnItemClick(new AdapterRCV.OnItemClick() {
            @Override
            public void clickName(String name) {
                Toast.makeText(RecycleViewActivity.this, name, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void clickAge(String age) {

            }

            @Override
            public void clickItem() {
                Toast.makeText(RecycleViewActivity.this, "item is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        tableView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        tableView.setAdapter(adapterRCV);
    }

    private List<Student> createList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        studentList.add(new Student("Duc Nguyen", 24, "002", "HN"));
        return studentList;
    }
}