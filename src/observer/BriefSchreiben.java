package observer;

public class BriefSchreiben implements IBeobachterListener {

    @Override
    public void update(Kunde kunde) {
       System.out.println("Willkommen Kunde" + kunde.getNachname());
       
        
    }
    
}
