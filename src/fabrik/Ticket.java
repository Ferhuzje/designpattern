package fabrik;

public abstract class Ticket implements ITicket {

    private String bezeichnung;
    private double preis;

    //Standard-Konstruktor
    public Ticket(){
        
    }

    public Ticket(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }


    //Getter und setter
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
    


}
