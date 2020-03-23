package com.example.bmitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b1)
        {
            Intent i = new Intent(MainActivity.this, ChartActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.b2)
        {
            Intent i = new Intent(MainActivity.this, FindBMI.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.b3)
        {
            Intent i = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(i);
        }
    }
}
