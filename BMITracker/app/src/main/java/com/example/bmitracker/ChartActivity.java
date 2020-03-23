package com.example.bmitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChartActivity extends AppCompatActivity implements View.OnClickListener {

    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(ChartActivity.this, FindBMI.class);
        startActivity(i);
    }
}
