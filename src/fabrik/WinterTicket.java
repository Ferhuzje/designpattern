package fabrik;

public class WinterTicket extends Ticket {

    private double rabatt;

    public WinterTicket() {
        super();
    }

    public WinterTicket(String bezeichnung, double preis) {
        super(bezeichnung, preis);
    }


    @Override
    public void printTicket() {
        // TODO Auto-generated method stub
        System.out.println("Ticket-Druck.");
        System.out.println("Ticket: " + super.getBezeichnung());
        System.out.println("Ticketpreis: " + super.getPreis());
        System.out.println("Bemerkungen: Sie erhalten Rabatt " + this.rabatt);
        
        
    }
    
}
