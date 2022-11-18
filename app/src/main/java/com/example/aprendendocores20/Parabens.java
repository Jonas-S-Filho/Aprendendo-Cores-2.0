package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;

public class Parabens extends AppCompatActivity {

    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parabens);

        //Botão voltar Menu Principal
        Button JogarNovamente = findViewById(R.id.btnJogarNovamente);

        JogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {JogarNovamente();

            }
        });
    }

    //Transição de Tela
    public void JogarNovamente() {
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}