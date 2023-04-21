package com.example.powervision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    TextView txtregistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=(Button)findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlogin=new Intent(MainActivity.this, Principal.class);
                startActivity(btnlogin);
            }
        });
        txtregistro=(TextView)findViewById(R.id.registro);
        txtregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtregistro=new Intent(MainActivity.this, Registro.class);
                startActivity(txtregistro);
            }
        });
    }
}