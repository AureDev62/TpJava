package org.example.Exo4;

public class Carre extends Forme{

    private double cote;

    public Carre(double cote){
        this.cote=cote;
    }
    @Override
    public double calculerAire() {
        return Math.pow(cote,2) ;
    }
}
