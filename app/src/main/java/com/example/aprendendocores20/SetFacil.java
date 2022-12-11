package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SetFacil extends AppCompatActivity {

        int imagemfacil=0;
        private Intent intent;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.set_facil);

                //Delay
                Handler delay = new Handler();

                //Receber valor e determinar imagem visivel
                imagemfacil = getIntent().getIntExtra("valorimg",0);

                //Definir imagem de fundo das respostas
                ImageView img1= findViewById(R.id.vermelhoFacil);
                ImageView img2 = findViewById(R.id.amareloFacil);
                ImageView img3 = findViewById(R.id.azulCianoFacil);

                //Botões
                Button btnamarelo = findViewById(R.id.btnFacilCorreto);
                Button btnvermelho = findViewById(R.id.btnFacilCorreto2);
                Button btnazul = findViewById(R.id.btnFacilCorreto3);
                ImageView voltarMenuFacil = findViewById(R.id.btnVoltarmenuFacil);
                Button tryAgain = findViewById(R.id.btnTryAgain3);

                switch (imagemfacil) {
                        case 0:
                           img1.setVisibility(View.VISIBLE);
                                break;
                        case 1:
                           img1.setVisibility(View.GONE);
                           img2.setVisibility(View.VISIBLE);
                                break;
                        case 2:
                           img1.setVisibility(View.GONE);
                           img3.setVisibility(View.VISIBLE);
                                break;
                }

                //Funções e Interações
                //Opções
                btnamarelo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        btnazul.setEnabled(false);
                        btnvermelho.setEnabled(false);

                                if (imagemfacil == 1) {
                                        btnamarelo.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                                        delay.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                        imagemfacil++;
                                                        proximacor(imagemfacil);

                                                }
                                        }, 2500);
                                } else {
                                        tryAgain.setVisibility(View.VISIBLE);

                                }
                        }
                });

                btnvermelho.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        btnazul.setEnabled(false);
                        btnamarelo.setEnabled(false);

                                if (imagemfacil == 0) {
                                        btnvermelho.setBackgroundTintList(getResources().getColorStateList(R.color.verde));
                                        delay.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                        imagemfacil++;
                                                        proximacor(imagemfacil);

                                                }
                                        }, 2500);
                                } else {
                                        tryAgain.setVisibility(View.VISIBLE);

                                }

                        }
                });

                btnazul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        btnvermelho.setEnabled(false);
                        btnamarelo.setEnabled(false);

                                if (imagemfacil == 2) {

                                        btnazul.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                                        delay.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                        JogarNV();


                                                }
                                        }, 3000);
                                } else {
                                        tryAgain.setVisibility(View.VISIBLE);

                                }
                        }
                });

                //Botão Tentar Novamente
                tryAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {tryAgain(imagemfacil);
                        }
                });

                //Botão Voltar
                voltarMenuFacil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {voltarMenuFacil();
                        }
                });
                }

        //-----------------------------------------------------------------------------------------
        //Transição de Tela
        public void proximacor(int x) {
                android.content.Intent intent = new Intent(this, SetFacil.class);
                intent.putExtra("valorimg", x);
                startActivity(intent);
                }
        //-----------------------------------------------------------------------------------------
        public void voltarMenuFacil(){
                android.content.Intent intent = new Intent(this, MenuPrincipal.class);
                startActivity(intent);
                }
        //-----------------------------------------------------------------------------------------
        public void tryAgain(int x){
                android.content.Intent intent = new Intent(this, SetFacil.class);
                intent.putExtra("valorimg", x);
                startActivity(intent);
                }
        //-----------------------------------------------------------------------------------------
        public void JogarNV() {
                android.content.Intent intent = new Intent(this, Parabens.class);
                startActivity(intent);
                }
}