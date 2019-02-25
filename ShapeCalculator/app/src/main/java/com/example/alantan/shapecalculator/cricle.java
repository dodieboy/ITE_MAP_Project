package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        EditText txtRadius = (EditText) findViewById(R.id.editTextRadius);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        if(txtRadius.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            radius = Double.parseDouble(txtRadius.getText().toString());

            circumference = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;

            txtViewResult.setText("circumference: " + String.format("%.2f", circumference) + "\nArea: " + String.format("%.2f", area));
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
