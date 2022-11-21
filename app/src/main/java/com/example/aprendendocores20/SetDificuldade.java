package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SetDificuldade extends AppCompatActivity {

    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_dificuldade);

        //Botões
        Button btnFacil = findViewById(R.id.btnFacil);
        Button btnInter = findViewById(R.id.btnIntermediario);
        Button btnDificil = findViewById(R.id.btnDificil);
        ImageButton voltarMenu = findViewById(R.id.btnVoltarmenuSet);

        //Funções e Interações
        //Dificuldades
        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {btnFacil();

            }
        });

        btnInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {btnInter();

            }
        });

        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {btnDificil();

            }
        });
        //----------------------------------------------------------
        //Botão Voltar
        voltarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarmenu();

            }
        });
    }

    //Transição de tela
    private void btnFacil() {
        android.content.Intent intent = new Intent(this, SetFacil.class);
        startActivity(intent);
    }

    private void btnInter() {
        android.content.Intent intent = new Intent(this, SetIntermediario.class);
        startActivity(intent);
    }

    private void btnDificil() {
        android.content.Intent intent = new Intent(this, SetDificilOpcoes.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------------------
    public void voltarmenu(){
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}