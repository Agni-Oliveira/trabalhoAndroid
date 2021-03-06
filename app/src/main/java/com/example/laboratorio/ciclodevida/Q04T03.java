package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q04T03 extends AppCompatActivity {
    EditText exame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q04_t03);
        exame = (EditText) findViewById(R.id.edNotaExame);
    }

    public void notaExame(View view){
        String msg= "";
        int nota = Integer.valueOf(exame.getText().toString());

        if(nota < 6){
            msg+= "Reprovado";
        }else msg+= "Aprovado";

        Intent i = new Intent(this, Q04T02.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }
}
