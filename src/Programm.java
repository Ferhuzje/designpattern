import fabrik.*;

public class Programm {

    public static void main(String[] args) {


    //Fabrik Methoden Beispiel


    ITicket ticket = TicketFabrik.getTicket();
    ticket.printTicket();

    }

    
}
