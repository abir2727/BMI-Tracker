package com.example.bmitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FindBMI extends AppCompatActivity implements View.OnClickListener {

    Button b;
    EditText et1, et2, et3, et4, et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_bmi);

        b = (Button) findViewById(R.id.b);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double w, h1, h2, a, m, bmi, h;
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        String s3 = et3.getText().toString();
        String s4 = et4.getText().toString();
        if(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty())
        {
            try
            {
                w = Double.parseDouble(s1);
                a = Double.parseDouble(s2);
                h1 = Double.parseDouble(s3);
                h2 = Double.parseDouble(s4);
                h = ((h1 * 12) + h2);
                m = h * 0.0254;
                bmi = w / (m * m);
                String bmiValue = "" + bmi;
                String age = "" + a;
                String height = "" + m;
                String weight = "" + w;
                Intent i = new Intent(FindBMI.this, FinalActivity.class);
                i.putExtra("b", bmiValue);
                i.putExtra("h", height);
                i.putExtra("w", weight);
                i.putExtra("a", age);
                startActivity(i);
            }
            catch (Exception e)
            {
                Toast.makeText(this,"You haven't entered correct values", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Toast.makeText(this,"You haven't given all parameters", Toast.LENGTH_LONG).show();
        }
    }
}
