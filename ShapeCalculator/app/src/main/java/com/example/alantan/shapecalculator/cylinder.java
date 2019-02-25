package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cylinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pyramid");
    }
    public void btnCalculateOnClick(View v) {
        double height, radius, volume, area;

        EditText txtHeight = (EditText) findViewById(R.id.editTextHeight);
        EditText txtRadius = (EditText) findViewById(R.id.editTextRadius);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        if(txtHeight.getText().toString().matches("") || txtRadius.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            height = Double.parseDouble(txtHeight.getText().toString());
            radius  = Double.parseDouble(txtRadius .getText().toString());

            area = (2 * Math.PI * radius * height) + (2 * Math.PI  * radius * radius);
            volume = Math.PI * radius * radius * height;

            txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
