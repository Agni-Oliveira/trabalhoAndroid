package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Q15T01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q15_t1);
    }

    public void enviarTotalPrimos(View view){
        int n=0, d=1, cont=0;
    String msg = "";

        while (n<100){
            while (d<=n){
                if (n%d==0)
                    cont++;
                d++;
            }

            if (cont==2)
                msg+= n+",";
            n++;d=1;cont=0;
            }


            Intent i = new Intent(this, Q15T02.class);
            i.putExtra("resultado", msg);
            startActivity(i);

        }
    }

