package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int i = 0;
    Button toabtn,countbtn;
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toabtn = (Button)findViewById(R.id.toabtn);
        countbtn = (Button)findViewById(R.id.countbtn);
        num = (TextView)findViewById(R.id.num);
        countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                num.setText(Integer.toString(i));
            }
        });
        toabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}