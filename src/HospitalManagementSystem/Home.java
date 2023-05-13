package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Home extends JFrame implements ActionListener, KeyListener {
    JButton admin, Patient, medicines, Reception;

    public Home() {
        setLayout(null);


        JLabel home_heading = new JLabel("Hospital Management System");
        home_heading.setFont(new Font("Elephant", Font.BOLD, 75));
        home_heading.setBounds(120, 50, 1200, 100);
        add(home_heading);


        admin = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\admin.jpg"));
        admin.setBackground(Color.white);
        admin.setBounds(330, 270, 150, 125);
        Reception = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\RECEPTION.jpg"));
        Reception.setBounds(500, 270, 150, 125);
        Patient = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\patient.jpg"));
        Patient.setBounds(670, 270, 150, 125);
        medicines = new JButton(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\med.jpg"));
        medicines.setBounds(840, 270, 150, 125);
        Reception.setBackground(Color.white);
        Patient.setBackground(Color.white);
        medicines.setBackground(Color.white);
        add(medicines);
        add(admin);
        add(Reception);
        add(Patient);
        admin.addKeyListener(this);
        admin.addActionListener(this);
        Reception.addActionListener(this);
        Reception.addKeyListener(this);
        Patient.addActionListener(this);
        Patient.addKeyListener(this);
        medicines.addActionListener(this);
        medicines.addKeyListener(this);

        JLabel admin = new JLabel("ADMIN");
        admin.setFont(new Font("Arial", Font.BOLD, 25));
        admin.setBounds(365, 400, 150, 35);
        JLabel rec = new JLabel("RECEPTION");
        rec.setFont(new Font("Arial", Font.BOLD, 25));
        rec.setBounds(500, 400, 150, 35);
        JLabel pat = new JLabel("PATIENT");
        pat.setFont(new Font("Arial", Font.BOLD, 25));
        pat.setBounds(695, 400, 150, 35);
        JLabel med = new JLabel("MEDICINE");
        med.setFont(new Font("Arial", Font.BOLD, 25));
        med.setBounds(855, 400, 150, 35);
        add(admin);
        add(rec);
        add(pat);
        add(med);


        setVisible(true);
        setSize(1400, 800);

    }


    public static void main(String[] args) {
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == admin) {

            new AdminLogin();
        } else if (e.getSource() == Patient) {

            new PatientFrame();
        } else if (e.getSource() == Reception) {

            new ReceptionistLogin();
        } else if (e.getSource() == medicines) {

            new PharmacyLogin();

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == admin) {

            new AdminLogin();
        } else if (e.getSource() == Patient) {

            new PatientFrame();
        } else if (e.getSource() == Reception) {

            new ReceptionistLogin();
        } else if (e.getSource() == medicines) {

            new PharmacyLogin();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


