package org.example;

import org.example.Exo2.Moto;
import org.example.Exo2.Vehicule;
import org.example.Exo2.Voiture;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Voiture maVoiture = new Voiture();

        Moto maMoto = new Moto();

        maVoiture.accelerer();
        maVoiture.ralentir();
        String message = maVoiture.tournerAdroite();
        System.out.println(message);
        maVoiture.tournerAgauche();
        System.out.println(maVoiture.tournerAgauche());
         }
}