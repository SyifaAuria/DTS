package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Edttxt1, Edttxt2;
    Button Btn1, Btn2, Btn3, Btn4, Btn5;
    TextView Lbl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edttxt1 = findViewById(R.id.Edttxt1);
        Edttxt2 = findViewById(R.id.Edttxt2);
        Btn1 = findViewById(R.id.Btn1);
        Btn2 = findViewById(R.id.Btn2);
        Btn3 = findViewById(R.id.Btn3);
        Btn4 = findViewById(R.id.Btn4);
        Btn5 = findViewById(R.id.Btn5);
        Lbl3 = findViewById(R.id.Lbl3);

    }

    public void Tampil_Tambah(View v) {
        if (Edttxt1.getText().length() > 0 && Edttxt2.getText().length() > 0) {
            int input_satu = Integer.parseInt(Edttxt1.getText().toString());
            int input_dua = Integer.parseInt(Edttxt2.getText().toString());
            int result = input_satu + input_dua;
            Lbl3.setText(" " + input_satu + " + " + input_dua + " = " + result);
            Toast.makeText(getApplicationContext(), "succes!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Mohon Masukan Data", Toast.LENGTH_LONG).show();
        }
    }

    public void Tampil_Kurang(View v) {
        if (Edttxt1.getText().length() > 0 && Edttxt2.getText().length() > 0) {
            int input_satu = Integer.parseInt(Edttxt1.getText().toString());
            int input_dua = Integer.parseInt(Edttxt2.getText().toString());
            int result = input_satu - input_dua;
            Lbl3.setText(" " + input_satu + " - " + input_dua + " = " + result);
            Toast.makeText(getApplicationContext(), "succes!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Mohon Masukan Data", Toast.LENGTH_LONG).show();
        }
    }

    public void Tampil_Kali(View v) {
        if (Edttxt1.getText().length() > 0 && Edttxt2.getText().length() > 0) {
            int input_satu = Integer.parseInt(Edttxt1.getText().toString());
            int input_dua = Integer.parseInt(Edttxt2.getText().toString());
            int result = input_satu * input_dua;
            Lbl3.setText(" " + input_satu + " * " + input_dua + " = " + result);
            Toast.makeText(getApplicationContext(), "succes!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Mohon Masukan Data", Toast.LENGTH_LONG).show();
        }
    }


    public void Tampil_Bagi(View v) {
        if (Edttxt1.getText().length() > 0 && Edttxt2.getText().length() > 0) {
            int input_satu = Integer.parseInt(Edttxt1.getText().toString());
            int input_dua = Integer.parseInt(Edttxt2.getText().toString());
            int result = input_satu / input_dua;
            Lbl3.setText(" " + input_satu + " / " + input_dua + " = " + result);
            Toast.makeText(getApplicationContext(), "succes!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Mohon Masukan Data", Toast.LENGTH_LONG).show();
        }
    }

    public void Tampil_Bersihkan(View v) {
        Edttxt1.setText("");
        Edttxt2.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Menu1.class));
        }
        return true;
    }
}