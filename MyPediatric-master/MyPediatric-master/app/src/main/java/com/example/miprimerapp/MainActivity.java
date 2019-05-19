package com.example.miprimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Ingresar(View view){
        Intent ingresar = new Intent(this,Login.class);
        startActivity(ingresar);
    }

    public void Registro(View view){
        Intent registro = new Intent(this,Registro.class);
        startActivity(registro);
    }

    public void Pediatras(View view){
        Intent pediatras = new Intent(this,Pediatras.class);
        startActivity(pediatras);
    }

    public void Proximo(View view){
        Toast.makeText(this, "Proximamente", Toast.LENGTH_SHORT).show();
    }

}
