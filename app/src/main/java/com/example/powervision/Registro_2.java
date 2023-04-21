package com.example.powervision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registro_2 extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText cedula;
    private EditText nombre;
    private EditText apellido;
    private EditText pais;
    private EditText email;
    private EditText password;
    private RadioButton rollibre;
    private  RadioButton rolconsumo;

    TextView txtregresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_2);
        setContentView(R.layout.activity_registro);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        cedula = findViewById(R.id.cedula);
        nombre = findViewById(R.id.name);
        apellido = findViewById(R.id.apellido);
        pais = findViewById(R.id.pais);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        rollibre = findViewById(R.id.libre);
        rolconsumo = findViewById(R.id.consumo);


        txtregresar=(TextView)findViewById(R.id.regresar);
        txtregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtregresar=new Intent(Registro_2.this, MainActivity.class);
                startActivity(txtregresar);
            }
        });

    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //este metodo es para veridicar que un usurio ya este logiado
        //updateUI(currentUser);
    }
    
}
