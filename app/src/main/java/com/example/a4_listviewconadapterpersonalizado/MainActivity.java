package com.example.a4_listviewconadapterpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvNombres;
    private ArrayList<Datos> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvNombres= (ListView) findViewById(R.id.lvNombres);

        datos = new ArrayList<Datos>();
        datos.add(new Datos("Amado","Perez","Cochine"));
        datos.add(new Datos("Kevin","Garcia","Camacho"));
        datos.add(new Datos("Yonathan","Pastrana","Tepeczin"));
        datos.add(new Datos("Yosef","Flores","Martinez"));
        datos.add(new Datos("Susano","Mora","Gatica"));
        datos.add(new Datos("Victor","Bautista","Nieves"));

        AdaptadorNombres mi_adaptador=new AdaptadorNombres(this, R.layout.list_nombres,datos);
        lvNombres.setAdapter(mi_adaptador);


        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Has pulsado: "+ datos.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}