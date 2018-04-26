package com.example.anggerpc.push_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etEmail = findViewById(R.id.etEmail);
        final TextView welcomeMessage = findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String username = intent.getStringExtra("username");

        String message = name + " welcome to user area";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etEmail.setText(email);
    }
}
