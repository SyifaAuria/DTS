package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Edttxt1;
    EditText Edttxt2;
    EditText Edttxt3;
    TextView Lbl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edttxt1 = findViewById(R.id.Edttxt1);
        Edttxt2 = findViewById(R.id.Edttxt2);
        Edttxt3 = findViewById(R.id.Edttxt3);
        Lbl3 = findViewById(R.id.Lbl3);
    }
    public void Tampil_Hasil(View v){
        Lbl3.setText("Data anda adalah = \n" + Edttxt1.getText() + "\n" + Edttxt2.getText() +"\n" + Edttxt3.getText());
    }
    public void Tampil_Bersihkan(View v){
        Edttxt1.setText("");
        Edttxt2.setText("");
        Edttxt3.setText("");

    }
}
