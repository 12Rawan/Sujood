package com.example.Sujood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class sebha extends AppCompatActivity {
    int i=0;
    EditText t_counter ;
    FloatingActionButton b_counter;
    ImageButton b_reset;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebha);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green300)));
        t_counter =findViewById(R.id.et_counter);
        b_counter =findViewById(R.id.btn_counter);
        b_reset =findViewById(R.id.reset_btn);
        b_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i++;
                t_counter.setText(""+i);
                saveData();

            }
        });

        b_reset.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t_counter.setText("0");
                i=0;
                saveData();
            }
        }));
        loadData();
        updateViews();
    }
    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, t_counter.getText().toString());
        editor.apply();
    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        i=Integer.parseInt(text);

    }

    public void updateViews() {
        t_counter.setText(text);

    }


}