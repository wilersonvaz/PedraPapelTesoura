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
                            resultado+="Empate!\n O Chiquinho também escolheu pedra!";
                            break;
                        case 1:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu!\n O Chiqinho escolheu tesoura!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                            resultado+="O Chiquinho escolheu papel e venceu!";
                            break;
                    }
                    break;

                case 1:

                    switch (valor){
                        case 0:
                            drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                            resultado+="O chiquinho escolheu pedra e venceu!";
                            break;

                        case 1:
                            drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                            resultado+="Empate!\n O Chiquinho também escolheu tesoura!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu!\n O Chiquinho escolheu papel!";
                            break;
                    }
                    break;

                case 2:
                    switch (valor){
                        case 0:
                            drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                            resultado+="Você venceu!\n O Chiquinho escolheu pedra!";
                            break;
                        case 1:
                            drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                            resultado+="O Chiquinho escolheu tesoura e venceu!";
                            break;
                        case 2:
                            drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                            resultado+="Empate!\n O Chiquinho também escolheu papel!";
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

            Random jogo = new Random();
            int chiquinho = jogo.nextInt(3);
            int mariazinha = jogo.nextInt(3);


            switch (par){
                case 0:

                    switch (chiquinho){
                        case 0:

                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu pedra\nMariazinha escolheu pedra\nEmpate!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu pedra\nMariazinha escolheu tesoura\nEmpate com o Chiquinho!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu pedra\nMariazinha escolheu pedra!\nEmpate!";
                                    break;
                            }

                            break;

                        case 1:

                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu tesoura\nMariazinha escolheu pedra\nEmpate com a Mariazinha!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu tesoura\nMariazinha escolheu tesoura\nVocê venceu!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu tesoura\nMariazinha escolheu papel\nEmpate!";
                                    break;
                            }
                            break;

                        case 2:

                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu papel\nMariazinha escolheu pedra\nVocê perdeu!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu papel\nMariazinha escolheu tesoura\nEmpate!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu pedra\nChiquinho escolheu papel\nMariazinha escolheu papel\nVocê perdeu!";
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
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu pedra\nMariazinha escolheu pedra\nVocê perdeu!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu pedra\nMariazinha escolheu tesoura\nVocê perdeu!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu pedra\nMariazinha escolheu papel\nEmpate!";
                                    break;
                            }
                            break;

                        case 1:
                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu tesoura\nMariazinha escolheu pedra\nVocê perdeu!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu tesoura\nMariazinha escolheu tesoura\nEmpate!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu tesoura\nMariazinha escolheu papel\nEmpate com o Chiquinho!";
                                    break;
                            }
                            break;

                        case 2:
                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu papel\nMariazinha escolheu pedra\nEmpate!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu papel\nMariazinha escolheu tesoura\nEmpate com a Mariazinha!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu tesoura\nChiquinho escolheu papel\nMariazinha escolheu papel\nVocê venceu!";
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
                                    drawable = getResources().getDrawable(R.drawable.cave_man_feliz);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu pedra\nMariazinha escolheu pedra\nVocê venceu!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu pedra\nMariazinha escolheu tesoura\nEmpate";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu pedra\nMariazinha escolheu papel\nEmpate com a Chiquinha!";
                                    break;
                            }
                            break;
                        case 1:

                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu tesoura\nMariazinha escolheu pedra\nEmpate!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu tesoura\nMariazinha escolheu tesoura\nVocê perdeu!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_bravo);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu tesoura\nMariazinha escolheu papel\nVocê perdeu!";
                                    break;
                            }
                            break;

                        case 2:

                            switch (mariazinha){
                                case 0:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu papel\nMariazinha escolheu pedra\nEmpate com o Chiquinho!";
                                    break;
                                case 1:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu papel\nMariazinha escolheu papel\nEmpate!";
                                    break;
                                case 2:
                                    drawable = getResources().getDrawable(R.drawable.cave_man_empate);
                                    imagem.setImageDrawable(drawable);
                                    resultado+="Você escolheu papel\nChiquinho escolheu papel\nMariazinha escolheu papel\nEmpate!";
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