package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Q16T01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q16_t1);
    }

    public void enviar100Primos(View view){

        int n=0, d=1, cont=100;
        String msg = "";

        while (n<1000){
            while (d<=n){
                if (n%d==0)
                    cont++;
                d++;
            }

            if (cont==2)
                msg+= n+",";
            n++;d=1;cont=0;
        }
        Intent q = new Intent(this, Q16T02.class);
        q.putExtra("resultado", msg);
        startActivity(q);

        }










    }



