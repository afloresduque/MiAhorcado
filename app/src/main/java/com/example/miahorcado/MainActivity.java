package com.example.miahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btOpciones;
    private Button btJugador;
    private Button btIniciar;
    private Button btFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Partida partida = new Partida();
        btOpciones =(Button) findViewById(R.id.buttonOpciones);
        btJugador =(Button) findViewById(R.id.buttonJugador);
        btIniciar =(Button) findViewById(R.id.buttonIniciar);
        btFinalizar =(Button) findViewById(R.id.buttonFinalizar);
    }

    public void buttonOpciones_click (View v){
        Intent opciones = new Intent(this,Pantalla2.class);
        startActivity(opciones);
    }

    public void buttonJugador_click (View v){
        Intent jugador = new Intent(this,Pantalla3.class);
        startActivity(jugador);
    }
}
