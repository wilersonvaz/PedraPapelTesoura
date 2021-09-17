package com.example.pedrapapeltesoura;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Configuracoes extends AppCompatActivity {
    private Button btnJogar;
    private RadioButton idJogador, idJogador2;
    private int nRodadas = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);
        setTitle("Configuraçoes");

        btnJogar = (Button) findViewById(R.id.btnJogar);
        idJogador = (RadioButton) findViewById(R.id.idJogador);
        idJogador2 = (RadioButton) findViewById(R.id.idJogador2);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qtdJogadores = 1;

                Bundle bundle = new Bundle();
                bundle.putInt("qtdJogadores", qtdJogadores);
                bundle.putInt("nRodadas", nRodadas);

                if(!idJogador.isChecked()) qtdJogadores = 2;

                if(qtdJogadores == 1){
                    Intent telaContra1 =new Intent(getApplicationContext(), JogarContraUm.class);
                    telaContra1.putExtras(bundle);
                    startActivity(telaContra1);
                }else{
                    Intent telaContra2 =new Intent(getApplicationContext(), JogarContraDois.class);
                    telaContra2.putExtras(bundle);
                    startActivity(telaContra2);
                }

            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.nRodada1:
                if (checked)
                    nRodadas = 1;
                    break;
            case R.id.nRodada3:
                if (checked)
                    nRodadas = 3;
                    break;
            case R.id.nRodada5:
                if (checked)
                    nRodadas = 5;
                    break;
        }
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
}