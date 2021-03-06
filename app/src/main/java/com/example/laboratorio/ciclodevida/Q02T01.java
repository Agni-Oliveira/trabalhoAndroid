package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q02T01 extends AppCompatActivity {
    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q02_t01);
        nome = (EditText) findViewById(R.id.edPalavra);
    }

    public void enviarResultado(View view) {
        String n = String.valueOf(nome.getText().toString());

        String msg = "";

        if ((nome.length() < 5)) {
            msg += "Informe uma palavra maior que 5 letras";
        }else msg+= "A primeira letra e: " + n.charAt(0)+ " Ultima letra e: " + n.charAt(nome.length()-1);

        Intent i = new Intent(this, Q02T02.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }

}