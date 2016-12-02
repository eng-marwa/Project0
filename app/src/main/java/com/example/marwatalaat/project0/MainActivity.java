package com.example.marwatalaat.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String msg = "";
        switch (view.getId()){
            case R.id.button:
                msg ="Popular Movies Project";
                break;
            case R.id.button2:
                msg ="Stock Hawk Project";
                break;
            case R.id.button3:
                msg ="Build it Bigger Project";
                break;
            case R.id.button4:
                msg ="Make Your App Material Project";
                break;
            case R.id.button5:
                msg ="Go Ubiquitous Project";
                break;
            case R.id.button6:
                msg ="Capstone Project";
                break;
        }
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
    }
}
