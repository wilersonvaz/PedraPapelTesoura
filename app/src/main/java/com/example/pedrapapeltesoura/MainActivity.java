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

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton pedra, tesoura, papel;
    private ImageView imagem;
    private TextView textoResultado;
    private Drawable drawable;
    private RadioButton idJogador, idJogador2;
    private int j = 1;
    private String resultado = "";
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
                if(idJogador2.isChecked()){
                    j = 2;
                    jogarContra2(0,j);
                }else{
                    jogar(0,j);
                }
            }
        });

        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idJogador2.isChecked()){
                    j = 2;
                    jogarContra2(1,j);
                }else{
                    jogar(1,j);
                }
            }
        });

        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idJogador2.isChecked()){
                    j = 2;
                    jogarContra2(2,j);
                }else{
                    jogar(2,j);
                }
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

    private void jogar(int par, int j) {
        try {
            resultado = "";

            Random jogo = new Random();
            int valor = jogo.nextInt(3);

            switch (par){
                case 0:
                    switch (valor){
                        case 0:
                            drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                            resultado+="Empate! O Chiquinho também escolheu pedra!";
                            break;
                        case 1:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu! O Chiqinho escolheu tesoura!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.chico);
                            resultado+="O Chiquinho escolheu papel e venceu!";
                            break;
                    }
                    break;

                case 1:

                    switch (valor){
                        case 0:
                            drawable = getResources().getDrawable(R.drawable.chico);
                            resultado+="O chiquinho escolheu pedra e venceu!";
                            break;

                        case 1:
                            drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                            resultado+="Empate! O Chiquinho também escolheu tesoura!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu! O Chiquinho escolheu papel!";
                            break;
                    }
                    break;

                case 2:
                    switch (valor){
                        case 0:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu! O Chiquinho escolheu pedra!";
                            break;
                        case 1:
                            drawable = getResources().getDrawable(R.drawable.chico);
                            resultado+="O Chiquinho escolheu tesoura e venceu!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                            resultado+="Empate! O Chiquinho também escolheu papel!";
                            break;
                    }
                    break;

            }

            imagem.setImageDrawable(drawable);
            textoResultado.setText(resultado);

        }catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }


    private void jogarContra2(int par, int j){

        try {
            resultado="";
            switch (par){
                case 0:
                    drawable = getResources().getDrawable(R.drawable.chico);
                    imagem.setImageDrawable(drawable);
                    resultado+="O Chiquinho venceu!";
                    break;
                case 1:
                    drawable= getResources().getDrawable(R.drawable.maria);
                    imagem.setImageDrawable(drawable);
                    resultado+="A Mariazinha venceu!";
                    break;
                case 2:
                    drawable= getResources().getDrawable(R.drawable.cave_man_feliz);
                    imagem.setImageDrawable(drawable);
                    resultado+="Você venceu!";
                    break;

            }

            textoResultado.setText(resultado);

        }catch (Exception e){
            System.out.println("Erro: "+e);
        }

    }


}