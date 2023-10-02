package org.example.Exo2;

public class Moto implements Vehicule{
    @Override
    public void accelerer() {
        System.out.println("la moto accélère");
    }

    @Override
    public void ralentir() {
        System.out.println("la moto ralenti");
    }

    @Override
    public String tournerAgauche() {
        return "La moto tourne à gauche";

    }

    @Override
    public String tournerAdroite() {
        return "La moto tourne à droite";

    }
}
