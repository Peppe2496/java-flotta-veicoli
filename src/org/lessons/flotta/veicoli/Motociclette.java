package org.lessons.flotta.veicoli;

public class Motociclette extends Veicoli{

    //ATTRIBUTI
    private boolean cavalletto;

    //COSTRUTTORI

    public Motociclette(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    //GETTER AND SETTER

    public boolean isCavalletto() {
        return cavalletto;
    }

    //METODI
   public String conCavalletto(){
        if (cavalletto){
            return "Ha il cavalletto";
        }else {
            return "Non ha il cavalletto";
        }
   }

    @Override
    public String toString() {
        return super.toString() + conCavalletto();
    }
}
