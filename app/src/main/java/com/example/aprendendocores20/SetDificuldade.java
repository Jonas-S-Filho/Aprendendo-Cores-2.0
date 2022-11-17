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

        Button btnInter = (Button) findViewById(R.id.btnIntermediario);
        btnInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {btnInter();

            }
        });

        ImageButton voltarMenu = (ImageButton) findViewById(R.id.btnVoltarmenuS1);
        voltarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarmenu();

            }
        });
    }

    private void btnInter() {
        android.content.Intent intent = new Intent(this, SetIntermediario.class);
        startActivity(intent);
    }

    public void voltarmenu(){
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}