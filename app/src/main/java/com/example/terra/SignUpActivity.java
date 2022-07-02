package com.example.terra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void verifyUser(View view) {
        // Extract the user's name, phone number, address, zipcode from the EditText
        // fields and store them in variables.

        EditText nameEditText = findViewById(R.id.nameEditText);
        String name = nameEditText.getText().toString();
        
        EditText phoneEditText = findViewById(R.id.phoneEditText);
        String phone = phoneEditText.getText().toString();
        
        EditText addressEditText = findViewById(R.id.addressEditText);
        String address = addressEditText.getText().toString();
        
        EditText zipcodeEditText = findViewById(R.id.zipcodeEditText);
        String zipcode = zipcodeEditText.getText().toString();
        
        // Checking if the user's name, phone, address or zipcode is empty.
        // If so, display an error message.
        if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || zipcode.isEmpty()) {
            // Show error message on empty fields.
            if (name.isEmpty())
                nameEditText.setError("Name is required");
            if (phone.isEmpty())
                phoneEditText.setError("Phone is required");
            if (address.isEmpty())
                addressEditText.setError("Address is required");
            if (zipcode.isEmpty())
                zipcodeEditText.setError("Zipcode is required");
        }
        
        else
        {
            // Creating a ArrayList to store the user's information.
            ArrayList <String> userInfo = new ArrayList<>();
            userInfo.add(name);
            userInfo.add(phone);
            userInfo.add(address);
            userInfo.add(zipcode);
            
            // Creating an Intent to go to the VerifyUserActivity with userInfo.
            Intent intent = new Intent(this, VerifyUserActivity.class);
            intent.putExtra("userInfo", userInfo);
            startActivity(intent);
        }
        
        

    }

    public void signIn(View view) {
        //Intent from SignUp to LogIn
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        startActivity(intent);
    }
}