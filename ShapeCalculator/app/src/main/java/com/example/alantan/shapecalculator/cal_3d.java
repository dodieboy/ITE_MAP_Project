package com.example.alantan.shapecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cal_3d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_3d);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("3D Shape");
    }
    public void btnCuboidOnClick(View v) { startActivity(new Intent(cal_3d.this, cuboid.class)); }
    public void btnSphereOnClick(View v) { startActivity(new Intent(cal_3d.this, sphere.class)); }
    public void btnPyramidOnClick(View v) { startActivity(new Intent(cal_3d.this, pyramid.class)); }
}
