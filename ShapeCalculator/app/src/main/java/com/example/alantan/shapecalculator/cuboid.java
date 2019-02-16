package com.example.alantan.shapecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cuboid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
    }
    public void btnCalculateOnClick(View v) {
        double height, width, length, volume, area;
        // do something when the button is clicked
        EditText txtLength = (EditText) findViewById(R.id.editTextLength);
        EditText txtWidth = (EditText) findViewById(R.id.editTextWidth);
        EditText txtHeight = (EditText) findViewById(R.id.editTextHeight);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        height = Double.parseDouble(txtHeight.getText().toString());
        width  = Double.parseDouble(txtWidth .getText().toString());
        length = Double.parseDouble(txtLength.getText().toString());

        area = 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
        volume = length * width * height;

        txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
    }
}
