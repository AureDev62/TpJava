package org.example.Exo2;

public class Voiture implements Vehicule{

    @Override
    public void accelerer() {
        System.out.println("la voiture accélère");

    }

    @Override
    public void ralentir() {
        System.out.println("la voiture ralenti");
    }

    @Override
    public String tournerAdroite() {
        return "la Voiture tourne à droite";
    }

    @Override
    public String tournerAgauche() {
        return"La voiture tourne à gauche";
    }
}
