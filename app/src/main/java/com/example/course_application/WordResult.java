package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WordResult extends AppCompatActivity {

    private AppCompatButton btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_result);


        final String getselectedAnsw = getIntent().getStringExtra("selectedAnsw");
        final ImageView btnBack2 = findViewById(R.id.btnBack2);
        btnNext = findViewById(R.id.btnNext2);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordResult.this, Profile.class));
            }
        });
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordResult.this, WordPractice.class));
                finish();
            }
        });
    }
}