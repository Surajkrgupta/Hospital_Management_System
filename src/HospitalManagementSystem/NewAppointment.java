package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;


public class NewAppointment extends JFrame implements ActionListener {
    JTextField patient_name_field, patient_id, patient_phone_field;
    JButton update, cancel, submit;
    JLabel lidno;

    JComboBox cbgander, timeing, dpt, vac;
    Choice cid;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    NewAppointment() {
        setLayout(null);
        setVisible(true);
        setSize(1200, 800);
        JLabel appointment = new JLabel(new ImageIcon("C:\\Users\\Suraj Kumar\\Desktop\\HMS\\src\\image\\newappointment.png"));
        appointment.setBounds(100, -50, 1200, 250);
        add(appointment);

        /*this is label for name*/
        JLabel patient_name_label = new JLabel("Patient's name");
        patient_name_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_name_label.setBounds(20, 150, 150, 30);
        add(patient_name_label);
        patient_name_field = new JTextField();
        patient_name_field.setBounds(170, 150, 150, 30);
        add(patient_name_field);

        JLabel patient_id_label = new JLabel("Patient's ID");
        patient_id_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_id_label.setBounds(20, 25, 100, 30);
        add(patient_id_label);
        patient_id = new JTextField();
        patient_id.setBounds(170, 25, 150, 30);
        add(patient_id);


        JLabel patient_phone_label = new JLabel("Contact No:");
        patient_phone_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_phone_label.setBounds(950, 150, 200, 30);
        add(patient_phone_label);
        patient_phone_field = new JTextField();
        patient_phone_field.setBounds(1100, 150, 150, 30);
        add(patient_phone_field);


        /*gender */
        JLabel patient_gender = new JLabel("Gender");
        patient_gender.setFont(new Font("Arial", Font.BOLD, 14));
        patient_gender.setBounds(20, 300, 150, 30);
        add(patient_gender);
        String gander[] = {"Male", "Fe-male", "Other"};
        cbgander = new JComboBox(gander);
        cbgander.setBounds(170, 300, 150, 30);
        add(cbgander);


        JLabel time = new JLabel("Timeing");
        time.setFont(new Font("Arial", Font.BOLD, 14));
        time.setBounds(500, 300, 150, 30);
        add(time);
        String tim[] = {"08:00-11:00", "11:00-01:00", "01:00-04:00"};
        timeing = new JComboBox(tim);
        timeing.setBounds(650, 300, 150, 30);
        add(timeing);


        JLabel dpet = new JLabel("Department");
        dpet.setFont(new Font("Arial", Font.BOLD, 14));
        dpet.setBounds(950, 300, 150, 30);
        add(dpet);
        String dpeti[] = {"ENT", "SKIN", "BRAIN", "CANCER"};
        dpt = new JComboBox(dpeti);
        dpt.setBounds(1100, 300, 150, 30);
        add(dpt);


        JLabel vacti = new JLabel("Vaccinated");
        vacti.setFont(new Font("Arial", Font.BOLD, 14));
        vacti.setBounds(500, 150, 150, 30);
        add(vacti);
        String vact[] = {"YES", "NO"};
        vac = new JComboBox(vact);
        vac.setBounds(650, 150, 150, 30);
        add(vac);

        JLabel appoi = new JLabel("Appointment ID");
        appoi.setFont(new Font("Arial", Font.BOLD, 14));
        appoi.setBounds(950, 25, 200, 30);
        add(appoi);
        lidno = new JLabel("7777" + first4);
        lidno.setBounds(1100, 25, 250, 30);
        add(lidno);


        submit = new JButton("SUBMIT");
        submit.addActionListener(this);

        submit.setBounds(500, 600, 120, 30);
        add(submit);
        cancel = new JButton("CANCEL");
        cancel.setBounds(700, 600, 120, 30);
        add(cancel);
        cancel.addActionListener(this);


        setSize(1400, 800);
        setVisible(true);
    }


    public static void main(String[] args) {
        new NewAppointment();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = patient_name_field.getText();
            String p_id = patient_id.getText();
            String ap_id = lidno.getText();
            String gen = (String) cbgander.getSelectedItem();
            String p_con = patient_phone_field.getText();
            String timein = (String) timeing.getSelectedItem();
            String dpetm = (String) dpt.getSelectedItem();
            String vaac = (String) vac.getSelectedItem();


            try {
                String query = "insert into appointment values('" + name + "','" + p_id + "','" + ap_id + "','" + gen + "','" + p_con + "','" + timein + "','" + dpetm + "','" + vaac + "')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully Added");
                setVisible(false);
            } catch (Exception ae) {
                ae.printStackTrace();
            }
            setVisible(false);





        } else if (e.getSource() == cancel) {

            setVisible(false);


        }

    }

    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        if (e.getSource() == submit) {


        } else if (e.getSource() == cancel) {

            setVisible(false);


        }

    }


    public void keyReleased(KeyEvent e) {

    }
}
