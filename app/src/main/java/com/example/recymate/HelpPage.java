package com.example.recymate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class HelpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);

        ImageButton baki = findViewById(R.id.imageButton);
        baki.setOnClickListener(v -> {
            finish();

        });



    }
}