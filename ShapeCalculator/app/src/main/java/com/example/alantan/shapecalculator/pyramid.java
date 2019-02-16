package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pyramid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pyramid");
    }

    public void btnCalculateOnClick(View v) {
        double height, sheight, width, length, volume, area;
        // do something when the button is clicked
        EditText txtLength = (EditText) findViewById(R.id.editTextLength);
        EditText txtWidth = (EditText) findViewById(R.id.editTextWidth);
        EditText txtHeight = (EditText) findViewById(R.id.editTextHeight);
        EditText txtSHeight = (EditText) findViewById(R.id.editTextSHeight);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        height = Double.parseDouble(txtHeight.getText().toString());
        sheight = Double.parseDouble(txtSHeight.getText().toString());
        width  = Double.parseDouble(txtWidth .getText().toString());
        length = Double.parseDouble(txtLength.getText().toString());

        area = sheight * width + sheight * length + width * length;
        volume = (length * width * height)/3;

        txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
    }
}
