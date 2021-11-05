package fabrik;

public class WinterTicket extends Ticket {

    private double rabatt;

    public WinterTicket() {
        super();
        super.setBezeichnung("Winter-Ticket");
        super.setPreis(100);
    }

    public WinterTicket(String bezeichnung, double preis) {
        super(bezeichnung, preis);
    }


    @Override
    public void printTicket() {
        
        System.out.println("Ticket-Druck.");
        System.out.println("Ticket: " + super.getBezeichnung());
        System.out.println("Ticketpreis: " + super.getPreis());
        System.out.println("Bemerkungen: Sie erhalten Rabatt " + this.rabatt);
        
        
    }
    
}
