package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.Arrays;

public class UpdatePatient extends JFrame implements ActionListener {
    JTextField patient_name_field, patient_father_name_field, patient_phone_field, patient_doc_field, patient_address_field, patient_pincode_field;
    JButton update, cancle;
    JLabel lidno;

    Choice cid;
    JComboBox cbgander;

    UpdatePatient() {
        setLayout(null);


        JLabel heading = new JLabel("Update Patient's Details");
        heading.setFont(new Font("Arial", Font.BOLD, 50));
        heading.setBounds(450, 20, 800, 50);
        add(heading);


        /*this is label for name*/
        JLabel patient_name_label = new JLabel("Patient's name");
        patient_name_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_name_label.setBounds(300, 150, 150, 30);
        add(patient_name_label);
        patient_name_field = new JTextField();
        patient_name_field.setBounds(450, 150, 150, 30);
        add(patient_name_field);


        /*thsi label refer to father details*/
        JLabel patient_father_name_label = new JLabel("father's Name");
        patient_father_name_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_father_name_label.setBounds(650, 150, 200, 30);
        add(patient_father_name_label);
        patient_father_name_field = new JTextField();
        patient_father_name_field.setBounds(850, 150, 150, 30);
        add(patient_father_name_field);


        /*this label holdes there id  and it wiil be genrated by random funcation*/
        JLabel patient_id_label = new JLabel("Patient's ID");
        patient_id_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_id_label.setBounds(300, 250, 100, 30);
        add(patient_id_label);
        lidno = new JLabel();
        lidno.setBounds(450, 250, 250, 30);
        add(lidno);



        /*thisi is label is refer to the patient mobile number details*/
        JLabel patient_phone_label = new JLabel("Contact No:");
        patient_phone_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_phone_label.setBounds(650, 250, 200, 30);
        add(patient_phone_label);
        patient_phone_field = new JTextField();
        patient_phone_field.setBounds(850, 250, 150, 30);
        add(patient_phone_field);


        /*gender */
        JLabel patient_gender = new JLabel("Gender");
        patient_gender.setFont(new Font("Arial", Font.BOLD, 14));
        patient_gender.setBounds(300, 350, 150, 30);
        add(patient_gender);
        String gander[] = {"Male", "Fe-male", "Other"};
        cbgander = new JComboBox((gander));
        String value = cbgander.getSelectedItem().toString();
        cbgander.setBounds(450, 350, 150, 30);
        add(cbgander);



        /*this level of code hens the patients document*/
        JLabel patient_doc_label = new JLabel("Adhar No:");
        patient_doc_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_doc_label.setBounds(650, 350, 150, 30);
        add(patient_doc_label);
        patient_doc_field = new JTextField();
        patient_doc_field.setBounds(850, 350, 150, 30);
        add(patient_doc_field);


        /*this code is used to take address of the patient*/
        JLabel patient_address_label = new JLabel("Full Address");
        patient_address_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_address_label.setBounds(300, 450, 150, 30);
        add(patient_address_label);
        patient_address_field = new JTextField();
        patient_address_field.setBounds(450, 450, 150, 30);
        add(patient_address_field);



        /*this code is used to have pincode of the adderss*/
        JLabel patient_pincode_label = new JLabel("Pin Code");
        patient_pincode_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_pincode_label.setBounds(650, 450, 150, 30);
        add(patient_pincode_label);
        patient_pincode_field = new JTextField();
        patient_pincode_field.setBounds(850, 450, 150, 30);
        add(patient_pincode_field);

        cid = new Choice();
        cid.setBounds(600, 85, 150, 30);
        add(cid);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
            while (rs.next()) {
                cid.add(rs.getString("PATIENT_ID"));
            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }

        try {
            Conn c = new Conn();
            String qu = "select * from patient where PATIENT_ID='" + cid.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(qu);
            while (rs.next()) {
                patient_name_field.setText(rs.getString("NAME"));
                patient_father_name_field.setText(rs.getString("FATHER_NAME"));
                lidno.setText(rs.getString("PATIENT_ID"));
                patient_gender.setText(rs.getString("GENDER"));
                patient_phone_field.setText(rs.getString("PATIENT_PHONE"));
                patient_doc_field.setText(rs.getString("PATIENT_ADHAR"));
                patient_pincode_field.setText(rs.getString("PATIENT_PINCODE"));
                patient_name_field.setText(rs.getString("NAME"));


            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }

        cid.addItemListener(ie -> {
            try {
                Conn c = new Conn();
                String qu = "select * from patient where PATIENT_ID='" + cid.getSelectedItem() + "'";
                ResultSet rs = c.s.executeQuery(qu);
                while (rs.next()) {
                    patient_name_field.setText(rs.getString("NAME"));
                    patient_father_name_field.setText(rs.getString("FATHER_NAME"));
                    patient_gender.setText(rs.getString("GENDER"));
                    patient_phone_field.setText(rs.getString("PATIENT_PHONE"));
                    patient_doc_field.setText(rs.getString("PATIENT_ADHAR"));
                    patient_pincode_field.setText(rs.getString("PATIENT_PINCODE"));


                }
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        });
        /*there are only one OR TWO button to submit the details*/
        update = new JButton("UPDATE");
        update.addActionListener(this);
        update.setBounds(500, 600, 120, 30);
        add(update);
        cancle = new JButton("CANCEL");
        cancle.setBounds(700, 600, 120, 30);
        add(cancle);
        cancle.addActionListener(this);


        /*below this ine the frame command will be run*/
        setSize(1400, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdatePatient();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == update) {
            String name = patient_name_field.getText();
            String f_name = patient_father_name_field.getText();
            String p_id = lidno.getText();
            String gen = cbgander.getSelectedItem().toString();
            String p_con = patient_phone_field.getText();
            String p_adhar = patient_doc_field.getText();
            String p_add = patient_address_field.getText();
            String p_pin = patient_pincode_field.getText();
            try {
                String query = "update patient set NAME='" + name + "',FATHER_NAME='" + f_name + "',GENDER='" + gen + "',PATIENT_PHONE='" + p_con + "',PATIENT_ADHAR='" + p_adhar + "',PATIENT_ADDRESS='" + p_add + "',PATIENT_PINCODE'" + p_pin + "' where PATIENT_ID=''" + cid + "'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully Added");
                setVisible(false);
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        if (a.getSource() == cancle) {
            setVisible(false);

        }
    }
}
