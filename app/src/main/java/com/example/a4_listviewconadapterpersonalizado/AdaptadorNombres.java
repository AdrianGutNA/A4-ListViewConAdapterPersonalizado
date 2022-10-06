package com.example.a4_listviewconadapterpersonalizado;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorNombres extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Datos> datos;

    public AdaptadorNombres(Context context, int layout, List<Datos> datos) {
        this.context = context;
        this.layout = layout;
        this.datos = datos;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.list_nombres, null);
        String nombreActual= String.valueOf(datos.get(position));
        TextView tvNombre=v.findViewById(R.id.txtNombre);
        tvNombre.setText(nombreActual);
        return v;
    }

}
