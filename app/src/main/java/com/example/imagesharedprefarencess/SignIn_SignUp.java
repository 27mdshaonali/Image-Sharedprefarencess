package com.example.imagesharedprefarencess;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_SignUp extends AppCompatActivity {

    EditText UserName, password;
    Button SignInbtn;
    TextView forgot_pass, need_help, create_account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_sign_up);

        UserName = findViewById(R.id.UserName);
        password = findViewById(R.id.password);
        SignInbtn = findViewById(R.id.SignInbtn);
        forgot_pass = findViewById(R.id.forgot_pass);
        need_help = findViewById(R.id.need_help);
        create_account = findViewById(R.id.create_account);


        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignIn_SignUp.this, SignUp.class);
                startActivity(intent);

            }
        });


        SignInbtn.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String sUser_Name = UserName.getText().toString().trim();
                String sPassword = password.getText().toString().trim();


                if (sUser_Name.length() == 0) {
                    UserName.setError("Enter a valid input");
                } else if (sPassword.length() == 0) {
                    password.setError("incorrect password");
                } else {
                    if (sUser_Name.equals("shaon") && sPassword.equals("shaon")) {


                        startActivity(new Intent(SignIn_SignUp.this, MainActivity.class));

                    } else {
                        Toast.makeText(SignIn_SignUp.this, "incorrect username or password", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });


        need_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignIn_SignUp.this, MainActivity.class));

            }
        });


    }

    // =================================== End second bracket here ======================

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(SignIn_SignUp.this);

        builder.setTitle("Main Activity");
        builder.setMessage("Do you want to exit?");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finishAndRemoveTask();

            }
        });

        builder.create();
        builder.show();

    }
}