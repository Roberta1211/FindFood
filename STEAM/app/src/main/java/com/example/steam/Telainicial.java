package com.example.steam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Telainicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);
    }

    public void Restaurantes(View view) {
        Intent i = new Intent(this, telarestaurante.class);
        startActivity(i);
    }

    public void Categorias(View view) {
        Intent i = new Intent(this, telacategorias.class);
        startActivity(i);
    }
}