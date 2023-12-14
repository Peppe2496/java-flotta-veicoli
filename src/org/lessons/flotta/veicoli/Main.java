package org.lessons.flotta.veicoli;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta listaDiVeicoli = new GestoreFlotta();
        Automobili fiatPunto = new Automobili("332jdsa", 1990, 5);
        listaDiVeicoli.inserisciVeicolo(fiatPunto);
        System.out.println(listaDiVeicoli.contatoreDiVeicoli());
    }
}
