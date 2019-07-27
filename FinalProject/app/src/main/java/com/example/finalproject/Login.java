package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etxt1, etxt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etxt1 = findViewById(R.id.etxt1);
        etxt2 = findViewById(R.id.etxt2);
        btn1 = findViewById(R.id.btn1);
    }

    public void login (View v) {

        String user = etxt1.getText().toString();
        String pass = etxt2.getText().toString();

        if (user.equals("admin")&&pass.equals("admin")){

            Toast.makeText(getApplicationContext(), "Berhasil Login!", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, MainActivity.class));
            finish();
        } else {
            AlertDialog.Builder abc = new AlertDialog.Builder(this);
            abc.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show();
        }
    }

    public void keluar (View v) {
        finish();
    }
}
