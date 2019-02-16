package com.example.alantan.shapecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cal_2d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_2d);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("2D Shape");
    }
    public void btnSquareOnClick(View v)
    {
        startActivity(new Intent(cal_2d.this, square.class));
    }
    public void btnCricleOnClick(View v)
    {
        startActivity(new Intent(cal_2d.this, cricle.class));
    }
}
