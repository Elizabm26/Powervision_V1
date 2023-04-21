package com.example.powervision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button siguientebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        siguientebtn=(Button)findViewById(R.id.btnsiguiente);
        siguientebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguientebtn= new Intent(Registro.this, Registro_2.class);
                startActivity(siguientebtn);
            }
        });
    }
}