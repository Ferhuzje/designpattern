import erbauer.Auto;
import erbauer.Auto.Kraftstoff;
import erbauer.Auto.Typ;
import fabrik.*;
import observer.*;

public class Programm {

    public static void main(String[] args) {


    //Fabrik Methoden Beispiel


    ITicket ticket = TicketFabrik.getTicket();
    ticket.printTicket();



    //--- Erbauer / Builder Pattern Beispiel

    ///Auto auto = new Auto(7, Typ.Sportwagen, Kraftstoff.DIESEL, 4, 150);


    KundeNeuForm KundeNeuForm = new KundeNeuForm();
    KundeNeuForm.setVisible(true);

    KundenAnzeige kundeAnzeige = new KundenAnzeige();
    kundeAnzeige.setVisible(true);

    Verwalter verwalter = Verwalter.getInstance();
    verwalter.anmelden(kundeAnzeige);

    DatenVerarbeitung dv = new DatenVerarbeitung();
    verwalter.anmelden(dv);

    BriefSchreiben bs = new BriefSchreiben();
    verwalter.anmelden(bs);
    



}
}

