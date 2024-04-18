package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void onClickLogin(View view) {
        Intent i = new Intent(Login.this, Language.class);
        startActivity(i);
    }


    public void onClickSignUp(View view) {
        Intent i = new Intent(Login.this, Signup.class);
        startActivity(i);
    }


    public void onClickBack(View view){
        Intent i = new Intent(Login.this, OnBoarding3.class);
        startActivity(i);
    }
}