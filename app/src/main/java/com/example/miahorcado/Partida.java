package com.example.miahorcado;

public class Partida {

    String palabraSecreta = new String();
    String [] palabras= new String[] {"PORTAL", "GATERA", "HELICOPTERO", "SONAJERO", "ALTAVOZ", "CHUBASQUERO", "SUPERCALIFRAGILISTICO", "MEANDRO"};
    StringBuilder palabraGuiones = new StringBuilder();
    int puntos;
    int vidas;

    Partida(){

    }

    public StringBuilder getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(StringBuilder palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public StringBuilder getPalabraGuiones() {
        return palabraGuiones;
    }

    public void setPalabraGuiones(StringBuilder palabraGuiones) {
        this.palabraGuiones = palabraGuiones;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
