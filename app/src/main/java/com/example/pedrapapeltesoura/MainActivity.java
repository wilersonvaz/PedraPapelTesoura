package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton pedra, tesoura, papel;
    private ImageView imagem;
    private TextView textoResultado;
    private Drawable drawable;
    private RadioButton idJogador, idJogador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedra = (ImageButton) findViewById(R.id.pedra);
        tesoura = (ImageButton) findViewById(R.id.tesoura);
        papel = (ImageButton) findViewById(R.id.papel);
        imagem = (ImageView) findViewById(R.id.resultado);
        textoResultado = (TextView) findViewById(R.id.textoResultado);
        idJogador = (RadioButton) findViewById(R.id.idJogador);
        idJogador2 = (RadioButton) findViewById(R.id.idJogador2);

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(1);
            }
        });

        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(2);
            }
        });

        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(3);
            }
        });

        idJogador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = getResources().getDrawable(R.drawable.cave_man);
                imagem.setImageDrawable(drawable);
                textoResultado.setText("");
            }
        });

        idJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable = getResources().getDrawable(R.drawable.cave_man_in_love);
                imagem.setImageDrawable(drawable);
                textoResultado.setText("");
            }
        });
    }

    private void jogar(int par) {
        try {

            switch (par){
               case 1:
                   drawable = getResources().getDrawable(R.drawable.chico);
                   imagem.setImageDrawable(drawable);
                   textoResultado.setText("O Chiquinho venceu!");
                   break;
               case 2:
                   drawable= getResources().getDrawable(R.drawable.maria);
                   imagem.setImageDrawable(drawable);
                   textoResultado.setText("A Mariazinha venceu!");
                   break;
               case 3:
                   drawable= getResources().getDrawable(R.drawable.cave_man);
                   imagem.setImageDrawable(drawable);
                   textoResultado.setText("Você venceu!");
                   break;


           }
        }catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }
}