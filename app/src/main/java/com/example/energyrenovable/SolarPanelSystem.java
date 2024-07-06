package com.example.energyrenovable;

import java.util.Random;

public class SolarPanelSystem {
    private double currentPowerOutput;
    private double maxPowerOutput;
    private double minPowerOutput;
    private Random random;

    public SolarPanelSystem(double maxPowerOutput, double minPowerOutput) {
        this.maxPowerOutput = maxPowerOutput;
        this.minPowerOutput = minPowerOutput;
        this.random = new Random();
        setCurrentPowerOutput();
    }
    public double getCurrentPowerOutput() {
        return currentPowerOutput;
    }

    public void setCurrentPowerOutput() {
        // Generar un número aleatorio entre minPowerOutput y maxPowerOutput
        this.currentPowerOutput = minPowerOutput + (maxPowerOutput - minPowerOutput) *
                random.nextDouble();
    }
}
