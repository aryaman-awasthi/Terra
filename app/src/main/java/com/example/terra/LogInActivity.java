package com.example.terra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void getVerificationCode(View view) {
        // Extracting string from EditText phoneNumber and pass it to VerificationActivity
        EditText phoneNumber = findViewById(R.id.phoneNumber);
        String phoneNumberString = phoneNumber.getText().toString();
        // Checking if phoneNumberString is empty or not and making sure it is a valid phone number
        if (phoneNumberString.isEmpty() || !phoneNumberString.matches(getString(R.string.phone_no_regex))) {
            // If phoneNumberString is empty or not a valid phone number, show error message
            phoneNumber.setError("Invalid phone number");
        } else {
            // If phoneNumberString is a valid phone number, go to VerificationActivity
            Intent intent = new Intent(getApplicationContext(), VerifyUserActivity.class);
            intent.putExtra("phoneNumber", phoneNumberString);
            startActivity(intent);
        }
    }

    public void signUp(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }
}