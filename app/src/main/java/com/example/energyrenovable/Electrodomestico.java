package com.example.energyrenovable;

public class Electrodomestico {
    private String nombre;
    private int potencia;
    private int eficiencia;


    public Electrodomestico(String nombre, int potencia, int eficiencia) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }
}

