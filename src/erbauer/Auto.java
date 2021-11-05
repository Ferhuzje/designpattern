package erbauer;

public class Auto {
    private int anzahlSitze;
    private Typ typ;
    private Kraftstoff kraftstoff;
    private int anzahlTueren;
    private int ps;
    

    public static class Erbauer {
        private Auto auto; // Erzeugt das Auto-Objekt, das später zurück gegebe wird

        public Erbauer(Typ typ) {
            auto = new Auto();
            auto.anzahlSitze = 2;
            auto.anzahlTueren = 2;

            if(typ == Typ.Kombi) {
                auto.anzahlTueren = 5;
                auto.anzahlSitze = 5;
                }
            else if(typ == Typ.VAN) {
                auto.anzahlTueren = 5;
                auto.anzahlSitze = 7;
            }
        }
    } 

    public Erbauer setKRaftstoff(Kraftstoff kraftstoff) {
        if(auto.typ == Typ.Sportwagen) {
            auto.kraftstoff = Kraftstoff.BENZIN;
        }
        else {
            auto.kraftstoff = kraftstoff;
        }
        return this;
   

    }

    public Erbauer setAnzahlSitze(int anzahlSitze){

        return this;
    }


    /*An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

    An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
    
    Why And When To Use Enums?
    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc. */
    
    public enum Typ {
        Sportwagen, 
        Limousine,
        Kombi,
        VAN,
        SUV
    }

     public enum Kraftstoff {
        DIESEL,
        BENZIN,
        ELEKTRO,
        HYBRID

    }
   
    public Auto() {
       
    }

    public Auto(int anzahlSitze, Typ typ, Kraftstoff kraftstoff, int anzahlTueren, int ps) {
        this.anzahlSitze = anzahlSitze;
        this.typ = typ;
        this.kraftstoff = kraftstoff;
        this.anzahlTueren = anzahlTueren;
        this.ps = ps;
    }

    
}
