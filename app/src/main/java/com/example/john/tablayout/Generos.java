package com.example.john.tablayout;

import java.io.Serializable;

public class Generos implements Serializable{


    private String famosos;
    private int imagen;
    private boolean bool;


    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

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
