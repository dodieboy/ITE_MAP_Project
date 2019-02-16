package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cricle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Circle");
    }

    public void btnCalculateOnClick(View v) {
        double radius, circumference, area;
        // do something when the button is clicked
        EditText txtRadius = (EditText) findViewById(R.id.editTextRadius);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        radius = Double.parseDouble(txtRadius.getText().toString());

        circumference = 2 * Math.PI * radius; area = Math.PI * radius * radius;
        area = Math.PI * radius * radius;

        txtViewResult.setText("circumference: " + String.format("%.2f", circumference) + "\nArea: " + String.format("%.2f", area));
    }
}
