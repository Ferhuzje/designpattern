package fabrik;

public class SommerTicket extends Ticket {

    

    public SommerTicket() {
        super();
        super.setBezeichnung("Sommer-Ticket");
        super.setPreis(50);
    }

    public SommerTicket(String bezeichnung, double preis) {
        super(bezeichnung, preis);
    }

    @Override
    public void printTicket() {
        // TODO Auto-generated method stub
        System.out.println("Ticket-Druck.");
        System.out.println("Ticket: " + super.getBezeichnung());
        System.out.println("Ticketpreis: " + super.getPreis());
        
    }
    
}
