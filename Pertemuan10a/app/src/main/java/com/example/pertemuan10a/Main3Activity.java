package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void pindahinternal(View v){
        Intent in = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(in);
    }

    public void  pindahexternal(View v){
        Intent ex = new Intent(Main3Activity.this, Main2Activity.class);
        startActivity(ex);
    }
}
