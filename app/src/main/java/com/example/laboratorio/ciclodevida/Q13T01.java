package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q13T01 extends AppCompatActivity {
    EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q13_t1);
        numero = (EditText) findViewById(R.id.edPrimo);
    }

    public void enviarPrimo(View view){
        int total = 0, j;
        String msg ="";
        int n = Integer.valueOf(numero.getText().toString());

        for (j=1;j<=n;j++){
            if (n%1==0)
                total++;
        }
        if (total==2){
            msg+= "O numero "+n+" é primo";
        }else
            msg+= "O numero "+n+" não é primo";

        Intent i = new Intent(this, Q13T02.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
