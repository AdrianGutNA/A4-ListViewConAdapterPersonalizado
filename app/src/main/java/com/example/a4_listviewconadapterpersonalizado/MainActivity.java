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

        datos = new ArrayList<Datos>();
        datos.add(new Datos(R.drawable.alumno,"Alejandro","Hernandez Cochine"));
        datos.add(new Datos(R.drawable.alumno,"Andres","Garcia Gracia"));
        datos.add(new Datos(R.drawable.alumno,"Adrian","Gutiérrez Nava"));
        datos.add(new Datos(R.drawable.alumno,"Cleto","Gonzales Jaimes"));
        datos.add(new Datos(R.drawable.alumno,"Tiburcio","Arellano Estrada"));
        datos.add(new Datos(R.drawable.alumno,"Alberto","Nava Maximo"));
        datos.add(new Datos(R.drawable.alumno,"Juan","Torres Sales"));
        datos.add(new Datos(R.drawable.alumno,"Ana","Miranda Bonifacio"));

        AdaptadorNombres mi_adaptador=new AdaptadorNombres(this, datos);
        lvNombres= (ListView) findViewById(R.id.lvNombres);
        lvNombres.setAdapter(mi_adaptador);

        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Datos datos = mi_adaptador.getItem(position);
                assert datos != null;

                Toast.makeText(MainActivity.this, "Has pulsado: " + datos.getNombre() + " " + datos.getApellidos(), Toast.LENGTH_LONG).show();
            }
        });
    }
}