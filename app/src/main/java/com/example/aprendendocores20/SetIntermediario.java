package com.example.aprendendocores20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.RejectedExecutionHandler;

public class SetIntermediario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_intermediario);

        Button btnCorreto = findViewById(R.id.btnInterCorreto);
        btnCorreto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorreto.setText("Laranja - Violeta - Verde");
                btnCorreto.setBackgroundTintList(getResources().getColorStateList(R.color.verde));

            }
        });
        Button btnErrado1 = findViewById(R.id.btnInterErrado1);
        btnErrado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorreto.setEnabled(false);
                btnErrado1.setText("Violeta - Verde - Laranja");
                btnErrado1.setBackgroundTintList(getResources().getColorStateList(R.color.vermelho));
            }
        });
    }
}