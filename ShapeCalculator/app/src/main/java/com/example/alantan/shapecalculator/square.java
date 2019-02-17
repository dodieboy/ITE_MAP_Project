package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Square");
    }
    public void btnCalculateOnClick(View v) {
        double length, breadth, perimeter, area;
        // do something when the button is clicked
        EditText txtLength = (EditText) findViewById(R.id.editTextLength);
        EditText txtWidth = (EditText) findViewById(R.id.editTextWidth);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        if(txtLength.getText().toString().matches("") || txtWidth.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            length = Double.parseDouble(txtLength.getText().toString());
            breadth = Double.parseDouble(txtWidth.getText().toString());
            perimeter = length * 2 + breadth * 2;
            area = length * breadth;

            txtViewResult.setText("Perimeter: " + String.format("%.2f", perimeter) + "\nArea: " + String.format("%.2f", area));
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
