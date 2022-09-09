package com.example.Sujood;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
public class doaa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doaa_activity);
        ListView doaaList = (ListView) findViewById(R.id.doaa_listView);
        Button add = (Button) findViewById(R.id.add_button);
        EditText addText = (EditText) findViewById(R.id.add_editText);
        final DoaaDBHelper newDoaa = new DoaaDBHelper(this);
        final ArrayAdapter<String> duaasAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        doaaList.setAdapter(duaasAdapter);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green300)));


        Cursor cursor = newDoaa.fetchAllDoaas();
        while (!cursor.isAfterLast()){
            duaasAdapter.add(cursor.getString(0));
            cursor.moveToNext();
        }

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newDoaa.createNewDoaa(addText.getText().toString());
                addText.getText().clear();
                Toast.makeText(getApplicationContext(), "Doaa Added", Toast.LENGTH_LONG).show();
                duaasAdapter.clear();
                Cursor cursor = newDoaa.fetchAllDoaas();
                while (!cursor.isAfterLast()){
                    duaasAdapter.add(cursor.getString(0));
                    cursor.moveToNext();
                }
            }
        });
    }
}