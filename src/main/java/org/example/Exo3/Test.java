package org.example.Exo3;

public class Test {
    public static void main(String[] args) {
        Couleur[] couleurs = Couleur.values();

        System.out.println("Mélange des couleurs primaires:");

        for(int i= 0; i< couleurs.length;i++){
            for(int j = i+1;j< couleurs.length;j++){
               // Couleur melanger = melanger(couleurs[i], couleurs[j]);
            }
            System.out.println(couleurs[i]);
        }
    }
}


