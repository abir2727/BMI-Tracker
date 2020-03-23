package com.example.bmitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, homeButton1;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(this);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setOnClickListener(this);
        homeButton1 = (Button) findViewById(R.id.homeButton1);
        homeButton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b1)
        {
            Intent i = new Intent(AboutActivity.this, FindBMI.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.homeButton1)
        {
            Intent i = new Intent(AboutActivity.this, MainActivity.class);
            startActivity(i);
        }
        if(v.getId() == R.id.tv1)
        {
            tv1.setVisibility(v.GONE);
            tv2.setVisibility(v.VISIBLE);
        }
        if(v.getId() == R.id.tv2)
        {
            tv2.setVisibility(v.GONE);
            tv1.setVisibility(v.VISIBLE);
        }
    }
}
