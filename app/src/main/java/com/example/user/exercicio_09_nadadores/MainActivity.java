package com.example.user.exercicio_09_nadadores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto_nadadores(View v) {
        Intent i = new Intent( this, nadadores.class );
        startActivity( i );
    }
    public void goto_restaurante(View v) {
        Intent i = new Intent( this, restaurante.class );
        startActivity( i );
    }

}
