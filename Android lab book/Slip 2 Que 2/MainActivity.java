package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    EditText editTextSender;
   EditText username;
   EditText password;
   Button Login;
   Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSender = (EditText) findViewById(R.id.editTextSenderData);

        public void buttonSenderPressed(View v) {
            Intent senderIntent = new Intent(this, Registration.class);
            senderIntent.putExtra("KEY_SENDER", editTextSender.getText().toString());
            startActivity(senderIntent);
        }

        username = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextText2);
        Login = findViewById(R.id.button);
        Reset = findViewById(R.id.button2);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Loggin Succesfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Loggin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                password.setText("");
            }
        });

    }
}