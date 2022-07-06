package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void pedra (View view){
    this.selecionado(1);

   }
    public void papel (View view){
        this.selecionado(2);

    }
    public void tesoura (View view){
        this.selecionado(3);
    }


    public void selecionado(Integer selecionado){
        ImageView resultado = findViewById(R.id.resultado);
        TextView mensagem = findViewById(R.id.textView);

        int aux = new Random().nextInt(3) ;
        String [] opcoes = {"pedra", "papel", "tesoura"};
        String opcoes2 = opcoes[aux];
        System.out.println(opcoes2);

        switch (opcoes2){
            case "pedra":
                resultado.setImageResource(R.drawable.pedra);

                if (selecionado == 1)
                {
                    mensagem.setText(R.string.Mensagem_empate);
                }
                else if (selecionado == 2){
                    mensagem.setText(R.string.Mensagem_vitoria);
                }
                else if (selecionado== 3){
                    mensagem.setText(R.string.Mensagem_derrota);
                }
                break;
            case "papel":
                resultado.setImageResource(R.drawable.papel);

                if (selecionado == 1)
                {
                    mensagem.setText(R.string.Mensagem_derrota);
                }
                else if (selecionado == 2){
                    mensagem.setText(R.string.Mensagem_empate);
                }
                else if (selecionado== 3){
                    mensagem.setText(R.string.Mensagem_vitoria);
                }
                break;
            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura);

                if (selecionado == 1)
                {
                    mensagem.setText(R.string.Mensagem_vitoria);
                }
                else if (selecionado == 2){
                    mensagem.setText(R.string.Mensagem_derrota);
                }
                else if (selecionado== 3){
                    mensagem.setText(R.string.Mensagem_empate);
                }
                break;
        }



    }
}
