package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q03T01 extends AppCompatActivity {
    EditText idade, civil, escolaridade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q03_t01);
        idade = (EditText) findViewById(R.id.edIdade);
        civil = (EditText) findViewById(R.id.edCivil);
        escolaridade = (EditText) findViewById(R.id.edEscolaridade);
    }

    public void enviarCargo(View view){
String msg = "";
        int id = Integer.valueOf(idade.getText().toString());
        String cv = String.valueOf(civil.getText().toString());
        String es = String.valueOf(escolaridade.getText().toString());

        if((id > 20) && ((cv.trim().equals("solteiro"))) && ((es.trim().equals("segundo grau")))){
            msg+= "Voce foi Admitido";
        }else msg+= "Voce não foi aprovado";

        Intent i = new Intent(this, Q03T02.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
