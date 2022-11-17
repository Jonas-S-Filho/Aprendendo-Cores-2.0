package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuConfig extends AppCompatActivity {

    private android.content.Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_config);

        ImageButton voltarMenu = (ImageButton) findViewById(R.id.btnVoltarmenuC1);
        voltarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {voltarmenu();

            }
        });
    }

    public void voltarmenu(){
        android.content.Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}