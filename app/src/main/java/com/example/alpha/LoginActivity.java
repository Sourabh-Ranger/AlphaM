package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername,etPassword;
    Button btsubmit;

    @Override
    protected void onCreate (Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btsubmit = findViewById(R.id.bt_submit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsername.getText().toString().equals(etPassword.getText().toString())) {

                    Intent submitIntent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(submitIntent);
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"password and username dosent match", Toast.LENGTH_SHORT).show();
                }

            }




        });
    } ;
}


