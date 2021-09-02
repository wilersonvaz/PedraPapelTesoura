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
    private ImageView imagem, chiquinhoImg, mariazinhaImg;
    private TextView textoResultado;
    private Drawable drawable;
    private RadioButton idJogador, idJogador2;
    private int qtdJog = 1;
    private String resultado = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedra = (ImageButton) findViewById(R.id.pedra);
        tesoura = (ImageButton) findViewById(R.id.tesoura);
        papel = (ImageButton) findViewById(R.id.papel);
        imagem = (ImageView) findViewById(R.id.resultado);
        chiquinhoImg = (ImageView) findViewById(R.id.chiquinho);
        mariazinhaImg = (ImageView) findViewById(R.id.mariazinha);
        textoResultado = (TextView) findViewById(R.id.textoResultado);
        idJogador = (RadioButton) findViewById(R.id.idJogador);
        idJogador2 = (RadioButton) findViewById(R.id.idJogador2);

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idJogador2.isChecked()){
                    qtdJog = 2;
                    jogarContra2(0);
                }else{
                    jogar(0);
                }
            }
        });

        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idJogador2.isChecked()){
                    qtdJog = 2;
                    jogarContra2(1);
                }else{
                    jogar(1);
                }
            }
        });

        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idJogador2.isChecked()){
                    qtdJog = 2;
                    jogarContra2(2);
                }else{
                    jogar(2);
                }
            }
        });

        idJogador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaImagem(chiquinhoImg, 5);
                mudaImagem(mariazinhaImg, 6);
                mudaImagem(imagem, 0);
                textoResultado.setText("");
            }
        });

        idJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaImagem(chiquinhoImg, 5);
                mudaImagem(mariazinhaImg, 6);
                mudaImagem(imagem, 3);
                textoResultado.setText("");
            }
        });
    }

    private void mudaImagem(ImageView image, int img){
        try{
            int[] imagensIds = {

                    R.drawable.cave_man, //0
                    R.drawable.cave_man_feliz, //1
                    R.drawable.cave_man_bravo, //2
                    R.drawable.cave_man_in_love, //3
                    R.drawable.cave_man_empate, //4
                    R.drawable.chico, //5
                    R.drawable.maria, //6
                    R.drawable.pedra_big, //7
                    R.drawable.papel_big, //8
                    R.drawable.tesoura_big, //9
                    R.drawable.exclamation //10
            };

            image.setImageResource(imagensIds[img]);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void jogar(int par) {
        try {
            resultado = "";

            mudaImagem(mariazinhaImg, 10);

            Random jogo = new Random();
            int valor = jogo.nextInt(3);

            switch (par){
                case 0:
                    switch (valor){
                        case 0:
                            mudaImagem(chiquinhoImg, 7);
                            mudaImagem(imagem, 4);
                            resultado = "Empate!";
                            break;
                        case 1:
                            mudaImagem(chiquinhoImg, 9);
                            mudaImagem(imagem, 1);
                            resultado = "Você venceu!";
                            break;
                        case 2:
                            mudaImagem(chiquinhoImg, 8);
                            mudaImagem(imagem, 2);
                            resultado = "Você perdeu!";
                            break;
                    }
                    break;

                case 1:

                    switch (valor){
                        case 0:
                            mudaImagem(chiquinhoImg, 7);
                            mudaImagem(imagem, 2);
                            resultado ="Você perdeu!";
                            break;

                        case 1:
                            mudaImagem(chiquinhoImg, 9);
                            mudaImagem(imagem, 4);
                            resultado = "Empate!";
                            break;
                        case 2:
                            mudaImagem(chiquinhoImg, 8);
                            mudaImagem(imagem, 1);
                            resultado = "Você venceu!";
                            break;
                    }
                    break;

                case 2:
                    switch (valor){
                        case 0:
                            mudaImagem(chiquinhoImg, 7);
                            mudaImagem(imagem, 1);
                            resultado = "Você venceu!";
                            break;
                        case 1:
                            mudaImagem(chiquinhoImg, 9);
                            mudaImagem(imagem, 2);
                            resultado = "Você perdeu!";
                            break;
                        case 2:
                            mudaImagem(chiquinhoImg, 8);
                            mudaImagem(imagem, 4);
                            resultado = "Empate!";
                            break;
                    }
                    break;

            }

            textoResultado.setText(resultado);

        }catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }


    private void jogarContra2(int par){

        try {
            mudaImagem(mariazinhaImg, 6);
            resultado="";
            int peso = 0;

            Random jogo = new Random();
            int chiquinho = jogo.nextInt(3);
            int mariazinha = jogo.nextInt(3);

            switch (par){
                case 0:

                    switch (chiquinho){
                        case 0:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg,7);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 2);
                                    //Mudar para Você perdeu
                                    resultado = "Empate!";
                                    break;
                            }

                            break;

                        case 1:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 1);
                                    resultado = "Você venceu!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                            }
                            break;

                        case 2:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 2);
                                    resultado = "Você perdeu!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 2);
                                    resultado = "Você perdeu!";
                                    break;
                            }
                            break;

                    }

                    break;

                case 1:

                    switch (chiquinho){
                        case 0:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem,2);
                                    resultado = "Você perdeu!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem,2);
                                    resultado = "Você perdeu!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                            }
                            break;

                        case 1:
                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 2);
                                    resultado = "Você perdeu!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem,4);
                                    resultado = "Empate!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                            }
                            break;

                        case 2:
                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 1);
                                    resultado = "Você venceu!";
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:

                    switch (chiquinho){
                        case 0:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 1);
                                    resultado = "Você venceu!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 7);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                            }
                            break;
                        case 1:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 9);
                                    mudaImagem(imagem, 2);
                                    resultado = "Você perdeu!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 9);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 2);
                                    resultado = "Você perdeu!";
                                    break;
                            }
                            break;

                        case 2:

                            switch (mariazinha){
                                case 0:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 7);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 1:
                                    mudaImagem(chiquinhoImg,8);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                                case 2:
                                    mudaImagem(chiquinhoImg, 8);
                                    mudaImagem(mariazinhaImg, 8);
                                    mudaImagem(imagem, 4);
                                    resultado = "Empate!";
                                    break;
                            }

                            break;
                    }

                    break;

            }

            textoResultado.setText(resultado);

        }catch (Exception e){
            System.out.println("Erro: "+e);
        }

    }


}