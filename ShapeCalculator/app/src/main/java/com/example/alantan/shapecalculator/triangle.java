package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Triangle");
    }
    public void btnCalculateOnClick(View v) {
        double height, base, side, perimeter, area;
        // do something when the button is clicked
        EditText txtHeight = (EditText) findViewById(R.id.editTextHeight);
        EditText txtBase = (EditText) findViewById(R.id.editTextBase);
        EditText txtSide = (EditText) findViewById(R.id.editTextSide);
        TextView txtViewResult = (TextView) findViewById(R.id.textViewResult);

        if(txtBase.getText().toString().matches("") || txtSide.getText().toString().matches("") || txtHeight.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            height = Double.parseDouble(txtHeight.getText().toString());
            base = Double.parseDouble(txtBase.getText().toString());
            side = Double.parseDouble(txtSide.getText().toString());

            perimeter = side + base + height;
            area = (base * height) / 2;

            txtViewResult.setText("Perimeter: " + String.format("%.2f", perimeter) + "\nArea: " + String.format("%.2f", area));
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
