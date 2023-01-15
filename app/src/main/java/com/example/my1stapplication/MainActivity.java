package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPrime;
    Button btnComp;

    TextView textQ;
    TextView textAns;

    int questCount;
    int num=0;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textQ=findViewById(R.id.textQuestions);
        btnPrime = findViewById(R.id.prime);
        btnPrime.setOnClickListener(this);
        btnComp = findViewById(R.id.composite);
        btnComp.setOnClickListener(this);

        RandomNumbersGeneration();
    }

    private void RandomNumbersGeneration(){

        Random randomNo= new Random();

        if(questCount<=20) {
            num = randomNo.nextInt(100) + 1;
            textQ.setText("Question No: "+questCount);
            textQ.setText(num + " is Prime or Composite?");

            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
    }

    @Override
    public void onClick(View view){

    }
}