package observer;

import javax.swing.*;




public class KundenAnzeige extends JFrame implements IBeobachterListener {

    JList liste;
    JScrollPane scrollPane;
    DefaultListModel dlm;

    public KundenAnzeige() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Kunden Liste");

        dlm = new DefaultListModel();
        liste = new JList(dlm);
        scrollPane = new JScrollPane(liste);
        add(scrollPane);
        
    }

    @Override
    public void update (Kunde kunde) {
        dlm.addElement(kunde.getVorname() + " " + kunde.getNachname());

    }
    
}
