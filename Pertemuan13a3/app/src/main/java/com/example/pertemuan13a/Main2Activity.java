package com.example.pertemuan13a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView Lbl2;
    EditText Edttxt1;
    EditText Edttxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Lbl2 = findViewById(R.id.Lbl2);
        Edttxt1 = findViewById(R.id.Edttxt1);
        Edttxt2 = findViewById(R.id.Edttxt2);
    }

    public void Tampil_Hasil(View v) {
        Lbl2.setText("NIM anda adalah /n" + Edttxt1.getText() + "Nama anda adalah /n" + Edttxt2.getText());
    }
}