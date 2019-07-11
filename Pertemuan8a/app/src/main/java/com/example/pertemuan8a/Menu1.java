package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    EditText Edttxt3;
    TextView Lbl5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Edttxt3 = findViewById(R.id.Edttxt3);
        Lbl5 = findViewById(R.id.Lbl5);

    }
    public void Tampil_Tentukan(View v){
        if (Edttxt3.getText().length() > 0){
            String masukan = Edttxt3.getText().toString();
            int angka =Integer.parseInt(masukan);
            int b = angka % 2;

            if (b == 0){
                Lbl5.setText("Bilangan " + angka + " adalah\nBilangan Genap");
            } else{
                Lbl5.setText("Bilangan " + angka + "adalah\nBilangan Ganjil");
            }
        }else {
            Toast.makeText(getApplicationContext(), "Mohon Masukan Data", Toast.LENGTH_LONG).show();
        }
    }
}
