package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity {

    private android.content.Intent Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        Button Jogar = (Button) findViewById(R.id.btnJogar);
        Jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Jogar();

            }
        });

        ImageButton config = (ImageButton) findViewById(R.id.btnConfig);
        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {config();

            }
        });

    }

    public void config() {
        android.content.Intent intent = new Intent(this, MenuConfig.class);
        startActivity(intent);
    }

    public void Jogar() {
        android.content.Intent intent = new Intent(this, SetDificuldade.class);
        startActivity(intent);
    }
}