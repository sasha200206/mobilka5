package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WordPractice extends AppCompatActivity {

    private AppCompatButton btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_practice);
        final ImageView btnBack2 = findViewById(R.id.btnBack2);
        btnCheck = findViewById(R.id.btnCheck2);



        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordPractice.this, WordResult.class);
                startActivity(intent);
                finish();
            }
        });
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordPractice.this, Profile.class));
                finish();
            }
        });
    }
}