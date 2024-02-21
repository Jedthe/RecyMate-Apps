package com.example.recymate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Detect extends AppCompatActivity {
    ImageButton bottomsheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect);

        ImageButton detect = findViewById(R.id.imageButton);
        detect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

   ImageButton help = findViewById(R.id.imageButton2);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HelpPage.class);
                startActivity(intent);
            }
        });

        Handler handler = new Handler();

        LinearLayout layout;
        layout = findViewById(R.id.layout2);

        bottomsheet = findViewById(R.id.imageButton3);
        bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        layout.setSelected(true);
                        TextView text1 = findViewById(R.id.textView2);
                        text1.setText("Plastic Bag");
                        text1.setBackground(getResources().getDrawable(R.drawable.rectangle));
                        text1.setTextColor(Color.BLUE);
                    }
                },1000);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showDialog();
                    }
                },2000);

            }
        });



    }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheet);

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);


    }


}