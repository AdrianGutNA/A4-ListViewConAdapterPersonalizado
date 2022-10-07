package com.example.a4_listviewconadapterpersonalizado;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AdaptadorNombres extends ArrayAdapter<Datos>
{

    public AdaptadorNombres(Context context, ArrayList<Datos> arrayList)
    {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        View v = convertView;
        v = LayoutInflater.from(getContext()).inflate(R.layout.list_nombres, parent, false);

        Datos datos = getItem(position);
        ImageView img = v.findViewById(R.id.imgView);
        assert datos != null;

        img.setImageResource(datos.getImagenId());

        TextView tvNombre = v.findViewById(R.id.txtNombre);
        tvNombre.setText(datos.getNombre());

        TextView tvApellido = v.findViewById(R.id.txtApellido);
        tvApellido.setText(datos.getApellidos());

        return v;
    }
}

