package com.example.bmitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinalActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv6, tv7;
    Button b, b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        tv6 = (TextView) findViewById(R.id.tv6);
        b = (Button) findViewById(R.id.b);
        b1 = (Button) findViewById(R.id.b1);
        tv7 = (TextView) findViewById(R.id.tv7);
        Bundle bu =  getIntent().getExtras();
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        if(bu != null)
        {
            String bmiValue = bu.getString("b");
            String a = bu.getString("a");
            String height = bu.getString("h");
            String weight = bu.getString("w");
            Double bmi, age, h, w, properWeight;
            bmi = Double.parseDouble(bmiValue);
            age = Double.parseDouble(a);
            h = Double.parseDouble(height);
            w = Double.parseDouble(weight);
            bmiValue = String.format("%.1f",bmi);
            height = String.format("%.3f",h);
            weight = String.format("%.0f",w);
            a = String.format("%.0f",age);
            if(age>= 19 && age <=29)
            {
                if(bmi <= 15.4)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 15.4 in this age, your health is excellent.");
                }
                else if(bmi <= 18.9)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 18.9 in this age, you are in good shape.");
                }
                else if(bmi <= 22.5)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 22.5 in this age, your health is fairly good.");
                }
                else
                {
                    properWeight = ((bmi-22.5)*h*h);
                    properWeight = Math.ceil(properWeight);
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is over than 22.5 in this age, you have obesity.");
                    tv7.setText("\nYou should lose at least " + properWeight + " KGs.");
                }
            }

            else if(age>= 30 && age <=39)
            {
                if(bmi <= 17.9)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 17.9 in this age, your health is excellent.");
                }
                else if(bmi <= 21.1)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 21.1 in this age, you are in good shape.");
                }
                else if(bmi <= 24.6)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 24.6 in this age, your health is fairly good.");
                }
                else
                {
                    properWeight = ((bmi-24.6)*h*h);
                    properWeight = Math.ceil(properWeight);
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is over than 24.6 in this age, you have obesity.");
                    tv7.setText("\nYou should lose at least " + properWeight + " KGs.");
                }
            }

            else if(age>= 40 && age <=49)
            {
                if(bmi <= 20.8)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 20.8 in this age, your health is excellent.");
                }
                else if(bmi <= 23.7)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 23.7 in this age, you are in good shape.");
                }
                else if(bmi <= 27.1)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 27.1 in this age, your health is fairly good.");
                }
                else
                {
                    properWeight = ((bmi-27.1)*h*h);
                    properWeight = Math.ceil(properWeight);
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is over than 27.1 in this age, you have obesity.");
                    tv7.setText("\nYou should lose at least " + properWeight + " KGs.");
                }
            }

            else if(age>= 50 && age <=59)
            {
                if(bmi <= 23.5)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 23.5 in this age, your health is excellent.");
                }
                else if(bmi <= 26.6)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 26.6 in this age, you are in good shape.");
                }
                else if(bmi <= 29.8)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 29.8 in this age, your health is fairly good.");
                }
                else
                {
                    properWeight = ((bmi-29.8)*h*h);
                    properWeight = Math.ceil(properWeight);
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is over than 29.8 in this age, you have obesity.");
                    tv7.setText("\nYou should lose at least " + properWeight + " KGs.");
                }
            }

            else
            {
                if(bmi <= 24)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 24.0 in this age, your health is excellent.");
                }
                else if(bmi <= 27.3)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 27.3 in this age, you are in good shape.");
                }
                else if(bmi <= 30.6)
                {
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is less than 30.6 in this age, your health is fairly good.");
                }
                else
                {
                    properWeight = ((bmi-30.6)*h*h);
                    properWeight = Math.ceil(properWeight);
                    tv6.setText("Age : " + a + "\nHeight (in Meters): " + height + "\nWeight (in KG): " + weight + "\nBMI: " + bmiValue + "\n\nSince your BMI is over than 30.6 in this age, you have obesity.");
                    tv7.setText("\nYou should lose at least " + properWeight + " KGs.");
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b)
        {
            Intent i = new Intent(FinalActivity.this, FindBMI.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.b1)
        {
            Intent i = new Intent(FinalActivity.this, MainActivity.class);
            startActivity(i);
        }
    }
}
