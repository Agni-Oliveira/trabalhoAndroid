package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Q03T02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q03_t02);
        String msg = getIntent().getStringExtra("resultado");
        TextView textResultado =
                (TextView) findViewById(R.id.textResultado);

        textResultado.setText(msg);
    }
}