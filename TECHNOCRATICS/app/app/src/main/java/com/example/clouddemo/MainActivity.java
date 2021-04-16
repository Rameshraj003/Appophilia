package com.example.clouddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton work1,work2,work3,work4,work5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       work1 = findViewById(R.id.work1);
       work2 = findViewById(R.id.work2);
       work3 = findViewById(R.id.work3);
       work4 = findViewById(R.id.work4);
       work5 = findViewById(R.id.work5);

       work1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, work1.class);
               startActivity(intent);
           }
       });
        work2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, work2.class);
                startActivity(intent);
            }
        });
        work3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, work3.class);
                startActivity(intent);
            }
        });
        work4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, work4.class);
                startActivity(intent);
            }
        });
        work5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, work5.class);
                startActivity(intent);
            }
        });


    }
}