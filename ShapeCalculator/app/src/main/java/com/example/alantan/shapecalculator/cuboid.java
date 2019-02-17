package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cuboid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cuboid");
    }
    public void btnCalculateOnClick(View v) {
        double height, width, length, volume, area;
        // do something when the button is clicked
        EditText txtLength = (EditText) findViewById(R.id.editTextLength);
        EditText txtWidth = (EditText) findViewById(R.id.editTextWidth);
        EditText txtHeight = (EditText) findViewById(R.id.editTextHeight);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        if(txtLength.getText().toString().matches("") || txtWidth.getText().toString().matches("") || txtHeight.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            height = Double.parseDouble(txtHeight.getText().toString());
            width  = Double.parseDouble(txtWidth .getText().toString());
            length = Double.parseDouble(txtLength.getText().toString());

            area = 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
            volume = length * width * height;

            txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
