package com.example.recymate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Setting extends AppCompatActivity implements AdapterView.OnItemSelectedListener{



    TextView text1,text2,text3;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Switch aSwitch;

        aSwitch=findViewById(R.id.switch1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == false){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
            }
        });


        Configuration config = getResources().getConfiguration();
        int currentNightMode = config.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                // Night mode is not active on device
                aSwitch.setChecked(false);
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                // Night mode is active on device
                aSwitch.setChecked(true);
                break;
        }


        back = findViewById(R.id.button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        text3=findViewById(R.id.textView3);
        text2=findViewById(R.id.textView2);
        text1=findViewById(R.id.teks);
        back=findViewById(R.id.button);

        if(text.equals("Bahasa Indonesia") == true){
            text1.setText("Pengaturan");
            text2.setText("Bahasa");
            text3.setText("Mode Gelap");
            back.setText("Kembali");
        }
        else{
            text1.setText("Settings");
            text2.setText("Language");
            text3.setText("Dark Mode");
            back.setText("Back");
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}