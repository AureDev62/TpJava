package org.example.Exo4;

public class Test {

    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Carre carre =new Carre(6);

        System.out.println(cercle.calculerAire());
        System.out.println(carre.calculerAire());
    }
}
