package org.lessons.flotta.veicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    private List<Veicoli> listaveicoli;

    public GestoreFlotta(){
        listaveicoli = new ArrayList<>();
    }
    public void inserisciVeicolo(Veicoli veicoli){
        if (!listaveicoli.contains(veicoli)){
            listaveicoli.add(veicoli);
        }else {
            System.out.println("Il veicolo con questa targa: " + veicoli.getTarga() + "esiste già");
        }
    }

    public String contatoreDiVeicoli() {
        int contatoreAuto = 0;
        int contatoreMoto = 0;
        for (Veicoli veicoli : listaveicoli) {
            if (veicoli instanceof Automobili){
                contatoreAuto++;
            }else if (veicoli instanceof Motociclette){
                contatoreMoto++;
            }
        }
        return " Numero di auto =" + contatoreAuto + " Numero di moto =" + contatoreMoto;
    }
    public Veicoli cercaVeicolo(String targa){
        Veicoli trovato = null;
        for (Veicoli veicolo : listaveicoli){
            if (veicolo.getTarga().equals(targa)){
                trovato = veicolo;
            }

        }
        return trovato;

    }
}


