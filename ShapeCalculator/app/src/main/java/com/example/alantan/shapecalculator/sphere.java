package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sphere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sphere");
    }
    public void btnCalculateOnClick(View v) {
        double radius, volume, area;
        // do something when the button is clicked
        EditText txtRadius = (EditText) findViewById(R.id.editTextRadius);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        radius = Double.parseDouble(txtRadius.getText().toString());

        area = 4 * Math.PI * radius * radius;
        volume = (Math.PI * radius * radius * radius) *4 / 3;

        txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
    }
}
