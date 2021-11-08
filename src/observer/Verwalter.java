package observer;

import java.util.ArrayList;

public class Verwalter {

    private static Verwalter verwalter = null;
    ArrayList<IBeobachterListener> empfaengerListe;

    private Verwalter() {
        empfaengerListe = new ArrayList<IBeobachterListener>();

    }

    public static Verwalter getInstance() {
        if(verwalter == null) 
            verwalter = new Verwalter();
        return verwalter;
    }
    
    public void anmelden(IBeobachterListener empfaenger) {
        empfaengerListe.add(empfaenger);

    }

    public void abmelden(IBeobachterListener empfaenger) {
        empfaengerListe.remove(empfaenger);
    }

    public void informiereEmpfaenger(Kunde kunde) {
        for(IBeobachterListener empfaenger : empfaengerListe) {
            empfaenger.update(kunde);
        }

    }
}
