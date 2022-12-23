package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.usernameID);
        password = (EditText) findViewById(R.id.passwordID);
        login = (Button) findViewById(R.id.loginButtonID);
    }

    public void movepage(View v){
        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("admin") && pass.equals("admin")){
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
        else if(name.equals("") || pass.equals("")){
            Toast.makeText(this, "Enter both Username and Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }
    }
}