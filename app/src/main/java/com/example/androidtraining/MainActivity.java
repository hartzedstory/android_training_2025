package com.example.androidtraining;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnClickMe;
    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Goi ham configUIElement
        configUIElement();
        configBehaviour();

        debug();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void configUIElement() {
        btnClickMe = findViewById(R.id.btnClickMe);
        tvName = findViewById(R.id.tvName);
    }

    private void configBehaviour() {
        //Su kien bam
        btnClickMe.setOnClickListener(view -> {
            // Khi bam button, set ten minh vao text view
            tvName.setText("DucNA");

            //push sang man hinh moi, su dung intent
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

            Log.d("TAG", "configBehaviour: ");
        });
    }

    private void debug() {
        int result = 0;
        for (int i = 0; i < 20; i ++) {
            result = result + 1;
            Log.d("Data", String.valueOf(result));
        }
    }
}