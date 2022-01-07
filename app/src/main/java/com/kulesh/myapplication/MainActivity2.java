package com.kulesh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nama=findViewById(R.id.nama);
        TextView lnama=findViewById(R.id.lnama);
        Bundle extras = getIntent().getExtras();
        if(extras == null) {

        } else {

           nama.setText(extras.getString("e"));
           lnama.setText(extras.getString("r"));
    }}
}