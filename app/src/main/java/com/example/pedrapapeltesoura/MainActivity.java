package com.example.pedrapapeltesoura;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//    private ImageButton pedra, tesoura, papel;
    public static ImageView imagem, chiquinhoImg, mariazinhaImg, resultadoImg;
    private LinearLayout layoutResult;
    private TextView textoResultado;
    private TextView placar;
    private Drawable drawable;
    int rodadas = 1;
    private String resultado = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placar = (TextView) findViewById(R.id.placar);
        imagem = (ImageView) findViewById(R.id.resultado);
        chiquinhoImg = (ImageView) findViewById(R.id.chiquinho);
        mariazinhaImg = (ImageView) findViewById(R.id.mariazinha);
        resultadoImg = (ImageView) findViewById(R.id.resultadoImg);
        textoResultado = (TextView) findViewById(R.id.textoResultado);
        layoutResult = (LinearLayout) findViewById(R.id.layoutResult);


        //Trecho alterado para atender sà especificações de mudança de tela
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            rodadas = bundle.getInt("rodadas");
            int cave = bundle.getInt("cave");
            int chiquinho = bundle.getInt("chiquinho");
            int mariazinha = bundle.getInt("mariazinha");
            int empate = bundle.getInt("empate");

            String resultado = "";

            if(mariazinha > -1){
                if(cave > chiquinho && cave > mariazinha){
                    placar.setText("Você venceu!");
                    mudaImagem(resultadoImg, 1);
                }else if(cave == chiquinho && cave == mariazinha){
                    placar.setText("Empate!");
                    mudaImagem(resultadoImg, 4);
                }else{
                    placar.setText("Você perdeu!");
                    mudaImagem(resultadoImg, 2);
                }
                resultado = "Rodadas: "+ String.valueOf(rodadas) +"\nVocê: "+ String.valueOf(cave) +"\nChiquinho: "+String.valueOf(chiquinho)+"\nMariazinha: "+String.valueOf(mariazinha)+"\nEmpates: "+String.valueOf(empate);
            }else{
                if(cave > chiquinho){
                    placar.setText("Você venceu!");
                    mudaImagem(resultadoImg, 1);
                }else if(cave < chiquinho){
                    placar.setText("Você perdeu!");
                    mudaImagem(resultadoImg, 2);
                }else{
                    placar.setText("Empate!");
                    mudaImagem(resultadoImg, 4);
                }
                resultado = "Rodadas: "+ String.valueOf(rodadas) +"\nVocê: "+ String.valueOf(cave) +"\nChiquinho: "+String.valueOf(chiquinho)+"\nEmpates: "+String.valueOf(empate);
            }

            textoResultado.setText(resultado);
            layoutResult.setVisibility(View.VISIBLE);
        }else{
            layoutResult.setVisibility(View.INVISIBLE);
        }

        //Fecha OnCreate
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main:
                Intent main=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(main);
                return true;
            case R.id.configuracoes:
                Intent configuracoes=new Intent(getApplicationContext(),Configuracoes.class);
                startActivity(configuracoes);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static void mudaImagem(ImageView image, int img){
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

}