package com.example.a4_listviewconadapterpersonalizado;

import java.util.ArrayList;

public class Datos
{
    private int imagenId;
    private String nombre;
    private String apellidos;

    public Datos() {}

    public Datos(int imagenId,String nombre, String apellidos)
    {
        this.imagenId = imagenId;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public  int getImagenId()
    {
        return imagenId;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

}


