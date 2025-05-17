package com.example.androidtraining;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private EditText tfName;
    private EditText tfNumber;
    private Button btnSubmit;

    private String name = "";
    private String age = "";

    private Button kotlinButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        configUI();
        configAction();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void configUI() {
        tfName = findViewById(R.id.tfName);
        tfNumber = findViewById(R.id.tfAge);
        btnSubmit = findViewById(R.id.button);
        kotlinButton = findViewById(R.id.kotlinButton);
    }

    private void configAction() {
        tfName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name = tfName.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        tfNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                age = tfNumber.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnSubmit.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), name + ": " + age.toString(), Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, RecycleViewActivity.class);
            startActivity(intent);
        });

        kotlinButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, KotlinActivity.class);
            startActivity(intent);
        });

    }

}