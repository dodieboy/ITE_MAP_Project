package com.example.alantan.shapecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList user = new ArrayList();
    public static ArrayList pass = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user.add("admin");
        pass.add("admin");
    }
    public void btnRegistorOnClick(View v)
    {
        startActivity(new Intent(MainActivity.this, Register.class));
    }
    public void btnLoginOnClick(View v)
    {
        String username, password;
        boolean successLogin = false;

        EditText txtUsername = (EditText) findViewById(R.id.editTextUsername);
        EditText txtPassword = (EditText) findViewById(R.id.editTextPassword);

        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();

        for (int i = 0; i < user.size(); i++) {
            if (username.equalsIgnoreCase(user.get(i).toString()) && password.equals(pass.get(i).toString()))
            {
                successLogin = true;
            }
        }
        if (successLogin == true)
        {
            startActivity(new Intent(MainActivity.this, menu.class));
            txtUsername.getText().clear();
            txtPassword.getText().clear();
        }
        else
        {
            Toast.makeText(this, "Incorrect Username or Password. Please enter correct Username and Password again!", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    protected void exitByBackKey() {
        AlertDialog alertbox = new AlertDialog.Builder(this)
            .setMessage("Do you want to exit application?")
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                // do something when the button is clicked
                public void onClick(DialogInterface arg0, int arg1) {
                finishAffinity(); // for API Level 16 and above
            }
            })
            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                // do something when the button is clicked
                public void onClick(DialogInterface arg0, int arg1) {
                }
            })
            .show();
    }
}
