package com.example.terra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void verifyUser(View view) {
        // Intent from SignUpActivity to VerificationActivity
        Intent intent = new Intent(getApplicationContext(), VerificationActivity.class);
        startActivity(intent);

    }

    public void signIn(View view) {
        //Intent from SignUp to LogIn
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        startActivity(intent);
    }
}