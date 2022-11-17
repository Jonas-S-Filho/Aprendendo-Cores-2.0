package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SetIntermediario extends AppCompatActivity {

    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_intermediario);
        //Delay
        Handler delay = new Handler();

        //Botões
        Button btnCorreto = findViewById(R.id.btnInterCorreto);
        Button btnErrado1 = findViewById(R.id.btnInterErrado1);
        Button btnErrado2 = findViewById(R.id.btnInterErrado2);
        ImageButton voltarMenuInter = findViewById(R.id.btnVoltarmenuInter);
        Button tryAgain = findViewById(R.id.btnTryAgain);

        //Funções e Interações
        //Opções
        btnCorreto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnErrado1.setEnabled(false);
                btnErrado2.setEnabled(false);
                btnCorreto.setText("Laranja - Violeta - Verde");
                btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                //test Transição para tela de parabéns (Ainda falta)
                delay.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SetIntermediario.this, "Correto", Toast.LENGTH_SHORT).show();
                    }
                },3000);

            }
        });

        btnErrado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorreto.setEnabled(false);
                btnErrado2.setEnabled(false);
                btnErrado1.setText("Violeta - Verde - Laranja");
                btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));


            }
        });

        btnErrado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorreto.setEnabled(false);
                btnErrado1.setEnabled(false);
                btnErrado2.setText("Verde - Laranja - Violeta");
                btnErrado2.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));

            }
        });

        //Tentar Novamente
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tryAgain();

            }
        });

        //Botão Voltar
        voltarMenuInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarMenuInter();

            }
        });
    }
    //Transição de Tela
    public void voltarMenuInter(){
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------------------
    public void tryAgain(){
        android.content.Intent intent = new Intent(this, SetIntermediario.class);
        startActivity(intent);
    }
}