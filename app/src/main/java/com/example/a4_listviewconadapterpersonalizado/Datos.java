package com.example.a4_listviewconadapterpersonalizado;

public class Datos {
    private String nombre;
    private String ApellidoP;
    private String ApellodoM;

    public Datos() {}

    public Datos(String nombre, String apellidoP, String apellodoM) {
        this.nombre = nombre;
        ApellidoP = apellidoP;
        ApellodoM = apellodoM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String apellidoP) {
        ApellidoP = apellidoP;
    }

    public String getApellodoM() {
        return ApellodoM;
    }

    public void setApellodoM(String apellodoM) {
        ApellodoM = apellodoM;
    }
    @Override
    public String toString(){
        return nombre+"  "+ApellidoP+"  "+ApellodoM;
    }
}
