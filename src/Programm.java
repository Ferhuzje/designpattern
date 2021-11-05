import erbauer.Auto;
import erbauer.Auto.Kraftstoff;
import erbauer.Auto.Typ;
import fabrik.*;

public class Programm {

    public static void main(String[] args) {


    //Fabrik Methoden Beispiel


    ITicket ticket = TicketFabrik.getTicket();
    ticket.printTicket();

    }

    //--- Erbauer / Builder Pattern Beispiel

    Auto auto = new Auto(7, Typ.Sportwagen, Kraftstoff.DIESEL, 4, 150)
}
