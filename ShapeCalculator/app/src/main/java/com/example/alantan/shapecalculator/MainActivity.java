package com.example.alantan.shapecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnRegistorOnClick(View v)
    {
        startActivity(new Intent(MainActivity.this, Register.class));
    }
    public void btnLoginOnClick(View v)
    {
        startActivity(new Intent(MainActivity.this, menu.class));
    }
}
