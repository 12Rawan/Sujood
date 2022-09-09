package com.example.Sujood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.Sujood.ui.prayertimes.prayerstimehome.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton Quraan_btn = (ImageButton) findViewById(R.id.Quraan);
        ImageButton sebha_btn = (ImageButton) findViewById(R.id.sebha);
        ImageButton azkar_btn = (ImageButton) findViewById(R.id.azkar);
        ImageButton prayers_btn = (ImageButton) findViewById(R.id.prayers);
        ImageButton duaas_btn = (ImageButton) findViewById(R.id.duaa);



        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green300)));
        Quraan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent (MainActivity.this ,quraan.class);
                startActivity(i);
            }
        });
        sebha_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i= new Intent (MainActivity.this ,sebha.class);
                startActivity(i);
            }
        });
        azkar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent (MainActivity.this ,azkar.class);
                startActivity(i);
            }
        });
       /* prayers_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent (MainActivity.this , PrayerTimesFragment.class);
                startActivity(i);
            }
        });*/
        duaas_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent (MainActivity.this ,doaa.class);
                startActivity(i);
            }
        });



    }



}