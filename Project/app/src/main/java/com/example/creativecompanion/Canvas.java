package com.example.creativecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Canvas extends AppCompatActivity {

    MyDatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        mydb = new MyDatabaseHelper(this);

    }
}