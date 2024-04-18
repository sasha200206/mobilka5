package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignupConfirm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_confirm);
    }


    public void onClickSignUp(View view) {
        Intent i = new Intent(SignupConfirm.this, Language.class);
        startActivity(i);
    }

    public void onClickBack(View view){
        Intent i = new Intent(SignupConfirm.this, Signup.class);
        startActivity(i);
    }
}