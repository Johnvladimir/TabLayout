package com.example.john.tablayout;

public class Generos {


    private String famosos;
    private int imagen;

    public Generos(String famosos, int imagen) {

        this.famosos = famosos;
        this.imagen = imagen;
    }

    public String getFamosos() {
        return famosos;
    }

    public void setFamosos(String famosos) {
        this.famosos = famosos;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
