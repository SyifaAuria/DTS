package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.action_login);

    }
    public void login(View v) {
        String usernameKey = edtUsername.getText().toString();
        String passwordKey = edtPassword.getText().toString();

        if (usernameKey.equals("admin")&&passwordKey.equals("admin")){

            Toast.makeText(getApplicationContext(), "Berhasil Login!", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, MainActivity.class));
            finish();
        } else {
            AlertDialog.Builder abc = new AlertDialog.Builder(this);
            abc.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show();
        }
    }
    public void keluar(View v){
        finish();
    }
}