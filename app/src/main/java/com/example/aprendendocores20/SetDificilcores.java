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

public class SetDificilcores extends AppCompatActivity {

    private android.content.Intent intent;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_dificilcores);
        
        //Delay
        Handler delay = new Handler();

        //Receber valor e determinar imagem visivel - Switch case
        int valCor;
        Bundle extras = getIntent().getExtras(); 
        if (extras != null) {
            //Intent intent = getIntent();
            valCor = intent.getIntExtra("valorcor");
        }

        //Imagens das cores
        ImageView imageView1 = findViewById(R.id.c04_AzulVerde);
        ImageView imageView2 = findViewById(R.id.c06_VermelhoVioleta);
        ImageView imageView3 = findViewById(R.id.c02_AmareloLaranja);
        //ImageView imageView4 = findViewById(R.id.);
        //ImageView imageView5 = findViewById(R.id.);
        ImageView imageView6 = findViewById(R.id.c01_AmareloVerde);

        //Tornar cor escolhida visivel 
        imagemCor(valCor);

        //Definir imagem de fundo das respostas
        ImageView fundo1 = findViewById(R.id.opcoes_01_02_04_06);
        //ImageView fundo2 = findViewById(R.id.);

        fundoBotoes(valCor);

        //Botões
        Button btn1 = findViewById(R.id.btnDificil_01_Am_Vd);
        Button btn2 = findViewById(R.id.btnDificil_02_Am_Lj);
        Button btn3 = findViewById(R.id.btnDificil_04_Az_Vd);
        Button btn4 = findViewById(R.id.btnDificil_06_Vm_Vt);
        ImageButton voltarMenuDifi2 = findViewById(R.id.btnVoltarmenuInter2);
        Button tryAgain = (Button) findViewById(R.id.);

        //Funções e Interações
        //Opções
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);

                //Adicionar comparação para definir erro ou acerto
                if (valCor == 0 || valCor == 4) {
                    btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                    //Transição para tela de parabéns
                    delay.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            JogarNV();

                        }
                    },4000);
                } else {
                    btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));
                    ryAgain.setVisibility(View.VISIBLE);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);

                //Adicionar comparação para definir erro ou acerto
                if (valCor == 1 || valCor == 2) {
                    btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                    //Transição para tela de parabéns
                    delay.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            JogarNV();

                        }
                    },4000);
                } else {
                    btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));
                    ryAgain.setVisibility(View.VISIBLE);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn4.setEnabled(false);

                //Adicionar comparação para definir erro ou acerto
                if (valCor == 3) {
                    btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                    //Transição para tela de parabéns
                    delay.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            JogarNV();

                        }
                    },4000);
                } else {
                    btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));
                    ryAgain.setVisibility(View.VISIBLE);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);

                //Adicionar comparação para definir erro ou acerto
                if (valCor == 5) {
                    btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

                    //Transição para tela de parabéns
                    delay.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            JogarNV();

                        }
                    },4000);
                } else {
                    btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));
                    ryAgain.setVisibility(View.VISIBLE);
                }
            }
        });

        //Botão Tentar Novamente
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tryAgain();

            }
        });

        //Botão Voltar
        voltarMenuInter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarMenuInter();

            }
        });
    }
    //Transição de Tela
    public void JogarNV() {
        android.content.Intent intent = new Intent(this, Parabens.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------------------
    public void voltarMenuInter(){
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------------------
    public void tryAgain(int valCor){
        android.content.Intent intent = new Intent(this, SetDificilcores.class);
        intent.putExtra("valorcor", valCor);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------------------
    public void imagemCor(int valCor) {
        switch (valCor) {
            case 0: 
                imageView1.setVisibility(View.VISIBLE);
                break;
            case 1: 
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.VISIBLE);
                break;
            case 2: 
                imageView1.setVisibility(View.GONE);
                imageView3.setVisibility(View.VISIBLE);
                break;
            case 3: 
                imageView1.setVisibility(View.GONE);
                imageView4.setVisibility(View.VISIBLE);
                break;
            case 4:
                imageView1.setVisibility(View.GONE);
                imageView5.setVisibility(View.VISIBLE);
                break;
            case 5:
                imageView1.setVisibility(View.GONE);
                imageView6.setVisibility(View.VISIBLE);
                break;
        }
    }
    //-----------------------------------------------------------------------------------------
     public void fundoBotoes(int valCor) {
        if (valCor == 1 || valCor == 2 || valCor == 4 || valCor == 6) {
            fundo1.setVisibility(View.VISIBLE);
        } else {
            fundo1.setVisibility(View.GONE);
            fundo2.setVisibility(View.VISIBLE);
        }
    }
}
