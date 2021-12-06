package com.example.effigy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sakura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakura);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
    }
}