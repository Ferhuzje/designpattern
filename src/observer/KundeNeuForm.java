package observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KundeNeuForm extends JFrame {

    JLabel lblVorname;
    JLabel lblNachname;
    JTextField tfVorname;
    JTextField tfNachname;
    JButton btnSpeichern;

    public KundeNeuForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);
        setTitle("Neuen Kunden anlegen");
        setLocation(300, 300);

        lblVorname = new JLabel("Vorname");
        lblNachname = new JLabel("Nachname");
        tfVorname = new JTextField();
        tfNachname = new JTextField();
        btnSpeichern = new JButton("Speichern");

		lblVorname.setBounds(20, 20, 100, 25);
		lblNachname.setBounds(20, 55, 100, 25);
		tfVorname.setBounds(135, 20, 100, 25);
		tfNachname.setBounds(135, 55, 100, 25);
		btnSpeichern.setBounds(135, 90, 100, 25);

        add(lblVorname);
        add(lblNachname);
        add(tfVorname);
        add(tfNachname);
        add(btnSpeichern);

        btnSpeichern.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                String vorname = tfVorname.getText();
                String nachname = tfNachname.getText();
                Kunde kunde = new Kunde(vorname, nachname);

                //Verwalter informieren über neue Kunden_Daten
                Verwalter.getInstance().informiereEmpfaenger(kunde);

            }
        });

    }
}
