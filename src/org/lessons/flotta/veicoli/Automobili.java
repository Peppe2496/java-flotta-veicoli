package org.lessons.flotta.veicoli;

public class Automobili extends Veicoli{

    //ATTRIBUTI
    private int numeroPortiere;

    //COSTRUTTORI

    public Automobili(String targa, int annoImmatricolazione, int numeroPortiere) {
        super(targa, annoImmatricolazione);
        this.numeroPortiere = numeroPortiere;
    }
    //GETTER AND SETTER
    public int getNumeroPortiere() {
        return numeroPortiere;
    }

    public void setNumeroPortiere(int numeroPortiere) {
        this.numeroPortiere = numeroPortiere;
    }
    //METODI
    @Override
    public String toString(){
        return super.toString() + "portiere = " + numeroPortiere;
    }
}
