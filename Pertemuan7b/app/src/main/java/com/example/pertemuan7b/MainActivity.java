package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Lbl3;
    EditText Edttxt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lbl3 = findViewById(R.id.Lbl3);
        Edttxt1 = findViewById(R.id.Edttxt1);
    }

    public void Tampil_Hasil(View v) {
        Lbl3.setText("Nama anda adalah : \n" + Edttxt1.getText());
    }
}
