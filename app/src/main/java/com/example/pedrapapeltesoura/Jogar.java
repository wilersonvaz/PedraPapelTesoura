package com.example.pedrapapeltesoura;

import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Jogar {

    public int qtdeJogadores;
    public int qtdeRodadas;
    public int jogadaUsuario;
    public int rodada = 0;
    

    public int getQtdeJogadores() {
        return qtdeJogadores;
    }

    public void setQtdeJogadores(int qtdeJogadores) {
        this.qtdeJogadores = qtdeJogadores;
    }

    public int getQtdeRodadas() {
        return qtdeRodadas;
    }

    public void setQtdeRodadas(int qtdeRodadas) {
        this.qtdeRodadas = qtdeRodadas;
    }

    public int getJogadaUsuario() {
        return jogadaUsuario;
    }

    public void setJogadaUsuario(int jogadaUsuario) {
        this.jogadaUsuario = jogadaUsuario;
    }



    public int jogar(){
//        String resultado= "";
        String resultado[] = {"Você venceu!", "Empate!", "Você perdeu!"};
        ImageView img[] = {MainActivity.imagem, MainActivity.chiquinhoImg, MainActivity.mariazinhaImg};

        Random jogo = new Random();
        try {
            if (this.getQtdeJogadores() == 1) {
                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                MainActivity.mudaImagem(MainActivity.mariazinhaImg, 10);

                //Define o valor jogado pela máquina

                int valor = jogo.nextInt(3);

                switch (this.getJogadaUsuario()) {
                    case 0:
                        switch (valor) {
                            case 0:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                MainActivity.mudaImagem(MainActivity.imagem, 4);
                                break;
                            case 1:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                MainActivity.mudaImagem(MainActivity.imagem, 1);
                                break;
                            case 2:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                MainActivity.mudaImagem(MainActivity.imagem, 2);
                                break;
                        }
                        break;

                    case 1:

                        switch (valor) {
                            case 0:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                MainActivity.mudaImagem(MainActivity.imagem, 2);
                                break;

                            case 1:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                MainActivity.mudaImagem(MainActivity.imagem, 4);
                                break;
                            case 2:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                MainActivity.mudaImagem(MainActivity.imagem, 1);
                                break;
                        }
                        break;

                    case 2:
                        switch (valor) {
                            case 0:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                MainActivity.mudaImagem(MainActivity.imagem, 1);
                                break;
                            case 1:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                MainActivity.mudaImagem(MainActivity.imagem, 2);
                                break;
                            case 2:
                                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                MainActivity.mudaImagem(MainActivity.imagem, 4);
                                break;
                        }
                        break;

                }

            } else {
                Log.v("DEBUG", "Entrou na segunda opção!");
                MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);

                MainActivity.mudaImagem(MainActivity.mariazinhaImg, 5);

                int chiquinho = jogo.nextInt(3);
                int mariazinha = jogo.nextInt(3);

//                for(int i=0;i<=this.getJogadaUsuario();i++){
//                    Log.v("DEBUG", "Entrou no for i!");
//                    for(int n=0;n<=chiquinho;n++){
//                        Log.v("DEBUG", "Entrou no for n!");
//                        for(int j=0;j<=mariazinha;j++){
//                            Log.v("DEBUG", "Entrou no for j!");
//                            //If para entrar só uma vez nesta parte do código
//                            if(j == mariazinha){
//                                if(i < n ){
//                                    vencedor = 0;
//                                    if(i < j){
//                                        vencedor = 1;
//                                    }
//                                }
//
//                                Log.v("DEBUG", "Vencedor: "+String.valueOf(vencedor));
//
//                                MainActivity.mudaImagem(img[0], i);
//
//                                MainActivity.mudaImagem(img[1], n);
//
//                                MainActivity.mudaImagem(img[2], j);
//                            }
//                        }
//                    }
//                }

                switch (this.getJogadaUsuario()) {
                    case 0:

                        switch (chiquinho) {
                            case 0:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Empate!";
                                        break;
                                }

                                break;

                            case 1:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 1);
//                                        resultado = "Você venceu!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                }
                                break;

                            case 2:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                }
                                break;

                        }

                        break;

                    case 1:

                        switch (chiquinho) {
                            case 0:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                }
                                break;

                            case 1:
                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                }
                                break;

                            case 2:
                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 1);
//                                        resultado = "Você venceu!";
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:

                        switch (chiquinho) {
                            case 0:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 1);
//                                        resultado = "Você venceu!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 7);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                }
                                break;
                            case 1:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 9);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 9);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 2);
//                                        resultado = "Você perdeu!";
                                        break;
                                }
                                break;

                            case 2:

                                switch (mariazinha) {
                                    case 0:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 7);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 1:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                    case 2:
                                        MainActivity.mudaImagem(MainActivity.chiquinhoImg, 8);
                                        MainActivity.mudaImagem(MainActivity.mariazinhaImg, 8);
                                        MainActivity.mudaImagem(MainActivity.imagem, 4);
//                                        resultado = "Empate!";
                                        break;
                                }

                                break;
                        }
                        break;
                }


            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
//        return resultado[indice];
    }

}
