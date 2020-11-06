package com.gabithu.semana4intento1;

public class Mascota {

    private String  nombre;
    private String megusta;
    private int foto;


    public Mascota(String nombre, String megusta, int foto) {
        this.nombre = nombre;
        this.megusta = megusta;
        this.foto = foto;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMegusta() {
        return megusta;
    }

    public void setMegusta(String megusta) {
        this.megusta = megusta;
    }
}
