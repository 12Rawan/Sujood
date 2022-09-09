package com.example.Sujood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class azkar extends AppCompatActivity {

    private Button azzakrelsabah;
    private Button azzkarmsaa;
    private Button azzkarestekaz;
    private Button azzkarnom;
    private Button azzkarwdoo;
    private Button azzkartaam;
    private Button azzkarmsgd;
    private Button azzkarazan ;
    private Button azzkarheg;
    private Button khhtmquran;
    private Button adaayanbwya;
    private Button adaayamayt;
    private Button adaayaanbyaa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);
        azzakrelsabah = (Button) findViewById(R.id.azakrelsabah);
        azzkarmsaa = (Button) findViewById(R.id.azkarmsaa);
        azzkarestekaz = (Button) findViewById(R.id.azkarestekaz);
        azzkarnom = (Button) findViewById(R.id.azkarnom);
        azzkarwdoo = (Button) findViewById(R.id.azkarwdoo);
        azzkartaam =(Button) findViewById(R.id.azkartaam );
        azzkarmsgd =(Button) findViewById(R.id.azkarmsgd );
        azzkarazan =(Button) findViewById(R.id.azkarazan );
        azzkarheg =(Button) findViewById(R.id.azkarheg );
        khhtmquran =(Button) findViewById(R.id.khtmquran );
        adaayanbwya =(Button) findViewById(R.id.adayanbwya );
        adaayamayt =(Button) findViewById(R.id.adayamayt );
        adaayaanbyaa =(Button) findViewById(R.id.adayaanbyaa );

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green300)));





        adaayaanbyaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity14.class);
                startActivity(intent);
            }
        });



        adaayamayt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity13.class);
                startActivity(intent);
            }
        });



        adaayanbwya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity12.class);
                startActivity(intent);
            }
        });


        khhtmquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity11.class);
                startActivity(intent);
            }
        });



        azzkarheg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity10.class);
                startActivity(intent);
            }
        });

        azzkarazan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity9.class);
                startActivity(intent);
            }
        });


        azzkarmsgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity8.class);
                startActivity(intent);
            }
        });


        azzkartaam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity7.class);
                startActivity(intent);
            }
        });


        azzkarwdoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity6.class);
                startActivity(intent);
            }
        });

        azzkarnom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity5.class);
                startActivity(intent);
            }
        });

        azzkarestekaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity4.class);
                startActivity(intent);
            }
        });


        azzkarmsaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity3.class);
                startActivity(intent);
            }
        });

        azzakrelsabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(azkar.this , MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}