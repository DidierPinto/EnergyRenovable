package com.example.energyrenovable;

public class CalculadoraConsumo {
    public static int calcularConsumoDiario(Electrodomestico electrodomestico, int horasUso) {
        return electrodomestico.getPotencia() * horasUso;
    }

    public static int calcularConsumoDiario(Electrodomestico electrodomestico, int horasUso, int eficiencia) {
        return electrodomestico.getPotencia() * horasUso * eficiencia;
    }
}

