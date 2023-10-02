package org.example.Exo5;

public class JoueurMachine implements Joueur {

    @Override
    public void jouer() {
        System.out.println("Le joueur machine joue");
    }

    @Override
    public void gagner() {
        System.out.println("Le joueur machine gagne");
    }

    @Override
    public void perdre() {
        System.out.println("Le joueur machine a perdu");
    }
}
