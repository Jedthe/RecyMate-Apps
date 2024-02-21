package com.example.recymate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageButton detect = findViewById(R.id.imageButton);
         detect.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(), Detect.class);
                 startActivity(intent);
             }
         });

        ImageButton locate = findViewById(R.id.imageButton2);
        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Locate.class);
                startActivity(intent);
            }
        });

        ImageButton setting = findViewById(R.id.imageButton3);
         setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Setting.class);
                startActivity(intent);
            }
        });


    }
}