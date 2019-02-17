package com.example.alantan.shapecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Register");
    }
    public void btnRegistorOnClick(View v)
    {
        String username, password;

        EditText txtUsername = (EditText) findViewById(R.id.editTextUsername);
        EditText txtPassword = (EditText) findViewById(R.id.editTextPassword);

        username = txtUsername.getText().toString().toLowerCase();
        password = txtPassword.getText().toString().toLowerCase();

        if(username.matches("") || password.matches("")){
            Toast.makeText(this, "Invalid Username or Password. Please enter correct Username and Password again!", Toast.LENGTH_SHORT).show();
        }
        else {
            for (int i = 0; i < MainActivity.user.size(); i++) {
                if (username.equals(MainActivity.user.get(i).toString()))
                {
                    Toast.makeText(this, "Username is used. Please enter another Username!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
            MainActivity.user.add(username);
            MainActivity.pass.add(password);
            Toast.makeText(this, "Account create successfully", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Register.this, MainActivity.class));
        }
    }
}
