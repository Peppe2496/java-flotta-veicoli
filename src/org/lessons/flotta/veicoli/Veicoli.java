package org.lessons.flotta.veicoli;

public abstract class Veicoli {

    //ATTRIBUTI
    private String targa;
    private int annoImmatricolazione;


    //COSTRUTTORI

    public Veicoli(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        
    }


    //GETTER AND SETTER

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    //METODI
     @Override
    public String toString(){
        return "targa =" + targa + "anno immatricolazione =" + annoImmatricolazione;
     }
    }

