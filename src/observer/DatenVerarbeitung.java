package observer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DatenVerarbeitung implements IBeobachterListener {
//in CSV Datei speichern
    @Override
    public void update(Kunde kunde) {
        try {
            //falls Datei vorhanden, hinten anhängen
            BufferedWriter bw = new BufferedWriter(new FileWriter("kunden.csv", true));
            bw.write(kunde.getVorname() + "," + kunde.getNachname() + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    
    }


    
}
