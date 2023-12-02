package com.example.imagesharedprefarencess;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    EditText FirstName, LastName,signup_username,signup_password,signup_re_password;

    TextView signup_login_account;

    Button SignUpbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        FirstName = findViewById(R.id.FirstName);
        LastName = findViewById(R.id.LastName);
        signup_username = findViewById(R.id.signup_username);
        signup_password = findViewById(R.id.signup_password);
        signup_re_password = findViewById(R.id.signup_re_password);
        signup_login_account = findViewById(R.id.signup_login_account);
        SignUpbtn = findViewById(R.id.SignUpbtn);

        signup_login_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignUp.this, SignIn_SignUp.class));

            }
        });

    }
}