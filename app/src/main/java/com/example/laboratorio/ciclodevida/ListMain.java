package com.example.laboratorio.ciclodevida;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListMain extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[] {"Calculadora", "Principal", "MainActivity", "Questão 1", "Questão 2", "Questão 3",
                "Questão 4", "Questão 5", "Questão 6", "Questão 7", "Questão 8", "Questão 9", "Questão 10",
                "Questão 11", "Questão 12", "Questão 13", "Questão 14", "Questão 15", "Questão 16"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();

        Intent i;
        switch (item){
            case "Calculadora":
                i = new Intent(this, Calculadora.class);
                startActivity(i);
                break;
            case "Principal":
                i = new Intent(this, Principal.class);
                startActivity(i);
                break;
            case "MainActivity":
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case "Questão 1":
                i = new Intent(this, Q01T01.class);
                startActivity(i);
                break;
            case "Questão 2":
                i = new Intent(this, Q02T01.class);
                startActivity(i);
                break;
            case "Questão 3":
                i = new Intent(this, Q03T01.class);
                startActivity(i);
                break;
            case "Questão  4":
                i = new Intent(this, Q04T01.class);
                startActivity(i);
                break;
            case "Questão  5":
                i = new Intent(this, Q05T01.class);
                startActivity(i);
                break;
            case "Questão  6":
                i = new Intent(this, Q06T01.class);
                startActivity(i);
                break;
            case "Questão  7":
                i = new Intent(this, Q07T01.class);
                startActivity(i);
                break;
            case "Questão  8":
                i = new Intent(this, Q08T01.class);
                startActivity(i);
                break;
            case "Questão  9":
                i = new Intent(this, Q09T01.class);
                startActivity(i);
                break;
            case "Questão  10":
                i = new Intent(this, Q10T01.class);
                startActivity(i);
                break;
            case "Questão  11":
                i = new Intent(this, Q11T01.class);
                startActivity(i);
                break;
            case "Questão  12":
                i = new Intent(this, Q12T01.class);
                startActivity(i);
                break;
            case "Questão  13":
                i = new Intent(this, Q13T01.class);
                startActivity(i);
                break;
            case "Questão  14":
                i = new Intent(this, Q14T01.class);
                startActivity(i);
                break;
            case "Questão  15":
                i = new Intent(this, Q15T01.class);
                startActivity(i);
                break;
            case "Questão 16":
                i = new Intent(this, Q16T01.class);
                startActivity(i);
                break;


        }
    }


}
