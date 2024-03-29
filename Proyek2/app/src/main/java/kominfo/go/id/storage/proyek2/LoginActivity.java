package kominfo.go.id.storage.proyek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class LoginActivity extends AppCompatActivity {

    public static final String FILENAME="login";

    EditText edtUsername, edtPassword;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.action_login);
        btnRegister = findViewById(R.id.action_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    void simpanFileLogin(){
        String isiFile = edtUsername.getText().toString() + ";" + edtPassword.getText().toString();
        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream=null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show();
        onBackPressed();
    }

    void login(){
        File sdcard = getFilesDir();
        File file = new File(sdcard, edtUsername.getText().toString());
        if(file.exists()){
            StringBuilder text = new StringBuilder();
            try{
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                while (line != null){
                    text.append(line);
                    line = br.readLine();
                }
                br.close();
            }catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
            String data = text.toString();
            String[] dataUser = data.split(";");

            if(dataUser[1].equals(edtPassword.getText().toString())){
                simpanFileLogin();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(this, "Password Tidak Sesuai", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "User Tidak Ditemukan", Toast.LENGTH_LONG).show();
        }
    }
}
