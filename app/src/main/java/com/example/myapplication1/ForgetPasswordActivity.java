package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.R;


public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forget_password);
        View loginText = findViewById(R.id.btnResetPassword);
        loginText.setOnClickListener(v -> {
            Intent intent = new Intent(ForgetPasswordActivity.this, ResetPasswordActivity.class);
            startActivity(intent);
        });
        View backtologinText = findViewById(R.id.tvBackToLogin);
        backtologinText.setOnClickListener(v -> {
            Intent intent = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}