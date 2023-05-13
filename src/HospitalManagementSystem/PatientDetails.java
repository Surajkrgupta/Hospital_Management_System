package HospitalManagementSystem;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PatientDetails extends JFrame implements ActionListener {
    Choice cid;
    JTable table;
    JButton search, print, update, add, cancle;

    PatientDetails() {
        setLayout(null);
        JLabel head = new JLabel("PATIENT'S DETAILS");
        head.setFont(new Font("Arial", Font.BOLD, 40));
        head.setBounds(500, 25, 1800, 50);
        add(head);


        cid = new Choice();
        cid.setBounds(1000, 100, 100, 80);
        add(cid);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
            while (rs.next()) {
                cid.add(rs.getString("PATIENT_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        table = new JTable();
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(55, 150, 1250, 500);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(1120, 100, 80, 20);
        add(search);
        search.addActionListener(this);

        print = new JButton("Print");
        print.setBounds(110, 100, 80, 20);
        add(print);
        print.addActionListener(this);

        update = new JButton("Update");
        update.setBounds(230, 100, 80, 20);
        add(update);
        update.addActionListener(this);
4
//        pokijbvbhnjmk,l;.
        add = new JButton("Add");
        add.setBounds(340, 100, 80, 20);
        add(add);
        add.addActionListener(this);

        cancle = new JButton("Cancle");
        cancle.setBounds(450, 100, 80, 20);
        add(cancle);
        cancle.addActionListener(this);

        setSize(1400, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PatientDetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String query = "select * from patient where PATIENT_ID = '" + cid.getSelectedItem() + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception eo) {
                eo.printStackTrace();
            }
        }
        if (e.getSource() == print) {
            try {
                table.print();
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        if (e.getSource() == add) {
            setVisible(false);
            new AddPatient();

        }
        if (e.getSource() == update) {
            //
        } else {
            setVisible(false);
        }

    }
}
