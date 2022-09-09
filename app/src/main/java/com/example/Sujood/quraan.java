package com.example.Sujood;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class quraan extends AppCompatActivity {
    MediaPlayer  mysound1;
    MediaPlayer  mysound2;
    MediaPlayer  mysound3;
    MediaPlayer  mysound4;
    MediaPlayer  mysound5;
    MediaPlayer  mysound6;
    MediaPlayer  mysound7;
    MediaPlayer  mysound8;
    MediaPlayer  mysound9;
    MediaPlayer  mysound10;
    MediaPlayer  mysound11;

    boolean playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quraan);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green300)));
        playing= false;

    }


    public void Play1(View view){
        if (mysound1 == null){
            mysound1 = MediaPlayer.create(quraan.this,R.raw.kwsr);
        }
        if(!playing){
           playing=true;
            mysound1.start();
        }
        else{
            mysound1.release();
            mysound1 = null;
            playing=false;
        }


    }


//////////////////////////////////////////////////////////////////////////

    public void Play2(View view){
        if (mysound2 == null){
            mysound2 = MediaPlayer.create(quraan.this,R.raw.doha);
        }
        if(!playing){
            playing=true;
            mysound2.start();
        }
        else{
            mysound2.release();
            mysound2 = null;
            playing=false;
        }
    }

    /////////////////////////////////////////////////////////////////////


    public void Play3(View view){
        if (mysound3 == null){
            mysound3 = MediaPlayer.create(quraan.this,R.raw.ekhlas);
        }
        if(!playing){
            playing=true;
            mysound3.start();
        }
        else{
            mysound3.release();
            mysound3 = null;
            playing=false;
        }
    }

    //////////////////////////////////////////////////////////////////////


    public void Play4(View view){
        if (mysound4 == null){
            mysound4 = MediaPlayer.create(quraan.this,R.raw.flq);
        }
        if(!playing){
            playing=true;
            mysound4.start();
        }
        else{
            mysound4.release();
            mysound4 = null;
            playing=false;
        }
    }


    ////////////////////////////////////////////////////////////////////////////

    public void Play5(View view){
        if (mysound5 == null){
            mysound5 = MediaPlayer.create(quraan.this,R.raw.elnas);
        }
        if(!playing){
            playing=true;
            mysound5.start();
        }
        else{
            mysound5.release();
            mysound5 = null;
            playing=false;
        }
    }


    ///////////////////////////////////////////////////////////////////////////////

    public void Play6(View view){
        if (mysound6 == null){
            mysound6 = MediaPlayer.create(quraan.this,R.raw.kafron);
        }
        if(!playing){
            playing=true;
            mysound6.start();
        }
        else{
            mysound6.release();
            mysound6 = null;
            playing=false;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////


    public void Play7(View view){
        if (mysound7 == null){
            mysound7 = MediaPlayer.create(quraan.this,R.raw.nasr);
        }
        if(!playing){
            playing=true;
            mysound7.start();
        }
        else{
            mysound7.release();
            mysound7 = null;
            playing=false;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////


    public void Play8(View view){
        if (mysound8 == null){
            mysound8 = MediaPlayer.create(quraan.this,R.raw.msd);
        }
        if(!playing){
            playing=true;
            mysound8.start();
        }
        else{
            mysound8.release();
            mysound8 = null;
            playing=false;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////



    public void Play9(View view){
        if (mysound9 == null){
            mysound9 = MediaPlayer.create(quraan.this,R.raw.kowrysh);
        }
        if(!playing){
            playing=true;
            mysound9.start();
        }
        else{
            mysound9.release();
            mysound9 = null;
            playing=false;
        }
    }


    //////////////////////////////////////////////////////////////////////////////


    public void Play10(View view){
        if (mysound10 == null){
            mysound10 = MediaPlayer.create(quraan.this,R.raw.elfeel);
        }
        if(!playing){
            playing=true;
            mysound10.start();
        }
        else{
            mysound10.release();
            mysound10 = null;
            playing=false;
        }
    }

    ///////////////////////////////////////////////////////////////////////


    public void Play11(View view){
        if (mysound11 == null){
            mysound11 = MediaPlayer.create(quraan.this,R.raw.maoon);
        }
        if(!playing){
            playing=true;
            mysound11.start();
        }
        else{
            mysound11.release();
            mysound11 = null;
            playing=false;
        }
    }


    ///////////////////////////////////////////////////////////////////










}