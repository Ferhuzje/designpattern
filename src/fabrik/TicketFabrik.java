package fabrik;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Fabrik Klasse enthaelt die Fabrik-Methode, die fuer die Erzeugung der Objekte verantwortlich ist
public class TicketFabrik {

    public static ITicket getTicket() {
        ITicket ticket = null;
        //GregorianCalender: Erster Monat, Januar = 0
        int monat = new GregorianCalendar().get(Calendar.MONTH) +1;

        if(monat >= 5 && monat <= 9 ) {
            ticket = new SommerTicket();
        }
        else {
            ticket = new WinterTicket();
        }
        return ticket;

    }

    
}
