package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PatientFrame extends JFrame implements ActionListener, KeyListener {
    JButton new_patient, reg_patient;

    PatientFrame() {
        setLayout(null);


        JLabel patient_heading = new JLabel("Continue..");
        patient_heading.setFont(new Font("Elephant", Font.PLAIN, 30));
        patient_heading.setBounds(140, 15, 180, 50);
        add(patient_heading);

        new_patient = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\newp.jpg"));
        new_patient.setBounds(60, 110, 125, 125);
        add(new_patient);

        reg_patient = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\regp.jpg"));
        reg_patient.setBounds(250, 110, 125, 125);
        add(reg_patient);
        new_patient.addActionListener(this);
        reg_patient.addActionListener(this);
        JLabel newp = new JLabel("NEW PATIENT");
        newp.setBounds(85, 250, 130, 15);
        JLabel regp = new JLabel("REGISTED PATIENT");
        regp.setBounds(260, 250, 150, 15);

        new_patient.addKeyListener(this);
        reg_patient.addKeyListener(this);

        add(regp);
        add(newp);

        setResizable(false);
        setSize(450, 350);
        setLocation(485, 220);
        setVisible(true);
    }


    public static void main(String[] args) {
        new PatientFrame();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == new_patient) {

            new AddPatient();
        } else if (e.getSource() == reg_patient) {

            new PatientLogin();

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == new_patient) {

            new AddPatient();
        } else if (e.getSource() == reg_patient) {

            new PatientLogin();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
