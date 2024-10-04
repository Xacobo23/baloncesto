package org.example;

public class Equipo{
    private String nombre;
    private int victorias;
    private int derrotas;
    private int puntosAFavor;
    private int puntosEnContra;

    public Equipo(){}

    public Equipo(String nombre, int victorias, int derrotas, int puntosAFavor, int puntosEnContra){
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.puntosAFavor = puntosAFavor;
        this.puntosEnContra = puntosEnContra;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    public int getVictorias() {
        return victorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getDerrotas() {
        return derrotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setPuntosAFavor(int puntosAFavor) {
        this.puntosAFavor = puntosAFavor;
    }
    public int getPuntosAFavor() {
        return puntosAFavor;
    }

    public void setPuntosEnContra(int puntosEnContra) {
        this.puntosEnContra = puntosEnContra;
    }
    public int getPuntosEnContra() {
        return puntosEnContra;
    }
}
