package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SetDificilOpcoes extends AppCompatActivity {

    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_dificil_opcoes);

        int valCor;

        //Botões
        ImageView AmareloVerde = findViewById(R.id.btnAmareloVerde);
        ImageView AmareloLaranja = findViewById(R.id.btnAmareloLaranja);
        ImageView VermelhoLaranja = findViewById(R.id.btnVermelhoLaranja);
        ImageView AzulVerde = findViewById(R.id.btnAzulVerde);
        ImageView AzulVioleta = findViewById(R.id.btnAzulVioleta);
        ImageView VermelhoVioleta = findViewById(R.id.btnVermelhoVioleta);
        ImageView voltarMenuDificil = findViewById(R.id.btnVoltarmenuDificil);

        //Funções e Interações
        //Opções
        AmareloVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 5;
                setDificilcores(valCor);
            }
        });

        AmareloLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 3;
                setDificilcores(valCor);
            }
        });

        VermelhoLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 2;
                setDificilcores(valCor);
            }
        });

        AzulVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 0;
                setDificilcores(valCor);
            }
        });

        AzulVioleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 4;
                setDificilcores(valCor);
            }
        });

        VermelhoVioleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valCor = 1;
                setDificilcores(valCor);
            }
        }); 

        //---------------------------------------------------------------------------------
        voltarMenuDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarMenuDificil();

            }
        });
  }   
    //Transição de Tela

    public void SetDificilcores(int valCor) {
        android.content.Intent intent = new Intent(this, SetDificilcores.class);
        intent.putExtra("valorcor", valCor);
        startActivity(intent);
    }

     public void voltarMenuDificil() {
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}
