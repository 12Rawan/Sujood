package com.example.Sujood;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DoaaDBHelper extends SQLiteOpenHelper {
    private static String databaseName = "doaaDatabase";
    SQLiteDatabase doaaDatabase;

    public DoaaDBHelper(@Nullable Context context) {
        super(context, databaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table doaa(id integer primary key, doaa text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists doaa");
        onCreate(sqLiteDatabase);
    }

    public void createNewDoaa(String doaa) {
        ContentValues row = new ContentValues();
        row.put("doaa", doaa);
        doaaDatabase = getWritableDatabase();
        doaaDatabase.insert("doaa", null, row);
        doaaDatabase.close();
    }

    public Cursor fetchAllDoaas(){
        doaaDatabase = getReadableDatabase();
        String[] rowDetails = {"doaa", "id"};
        Cursor cursor = doaaDatabase.query("doaa", rowDetails, null, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        doaaDatabase.close();
        return cursor;
    }
}
