package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        if(txtLength.getText().toString().matches("") || txtWidth.getText().toString().matches("")){
            Toast.makeText(this, "Please fill in all value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            width  = Double.parseDouble(txtWidth .getText().toString());
            length = Double.parseDouble(txtLength.getText().toString());
            if(txtHeight.getText().toString().matches("")){
                height = Double.parseDouble(txtHeight.getText().toString());

                volume = (length * width * height)/3;

                txtViewResult.setText("Surface Area: slant height needed\nVolume: " + String.format("%.2f", volume));
            }

            else if(txtSHeight.getText().toString().matches("")){
                sheight = Double.parseDouble(txtSHeight.getText().toString());

                area = sheight * width + sheight * length + width * length;

                txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: height needed");
            }
            else {
                height = Double.parseDouble(txtHeight.getText().toString());
                sheight = Double.parseDouble(txtSHeight.getText().toString());
                area = sheight * width + sheight * length + width * length;
                volume = (length * width * height)/3;

                txtViewResult.setText("Surface Area: " + String.format("%.2f", area) + "\nVolume: " + String.format("%.2f", volume));
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(this, "Only number is allowed", Toast.LENGTH_SHORT).show();
        }
    }
}
