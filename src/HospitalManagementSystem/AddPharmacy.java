package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddPharmacy extends JFrame implements ActionListener {

    JTextField patient_name_field, patient_father_name_field, patient_phone_field, patient_doc_field, patient_address_field, patient_pincode_field;
    JButton submit, cancel;
    JLabel lidno;
    JComboBox cbgander;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddPharmacy(){
        setLayout(null);

        JLabel heading = new JLabel("Medicine's Details");
        heading.setFont(new Font("Arial", Font.BOLD, 50));
        heading.setBounds(450, 20, 800, 50);
        add(heading);


        /*this is label for name*/
        JLabel patient_name_label = new JLabel("Medicine's name");
        patient_name_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_name_label.setBounds(300, 150, 150, 30);
        add(patient_name_label);
        patient_name_field = new JTextField();
        patient_name_field.setBounds(450, 150, 150, 30);
        patient_name_field.setEnabled(true);
        add(patient_name_field);


        /*thsi label refer to father details*/
        JLabel patient_father_name_label = new JLabel("Company's Name");
        patient_father_name_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_father_name_label.setBounds(650, 150, 200, 30);
        add(patient_father_name_label);
        patient_father_name_field = new JTextField();
        patient_father_name_field.setBounds(850, 150, 150, 30);
        add(patient_father_name_field);



        /*this label holdes there id  and it wiil be genrated by random funcation*/
        JLabel patient_id_label = new JLabel("Medicine's ID");
        patient_id_label.setFont(new Font("Arial", Font.BOLD, 14));
        patient_id_label.setBounds(300, 250, 200, 30);
        add(patient_id_label);
        lidno = new JLabel("1111" + first4);
        lidno.setBounds(450, 250, 250, 30);
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
        new AddPharmacy();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (patient_father_name_field.getText()==""){
            return;
        }

        if (patient_name_field.getText()==""){
            return;
        }

        if (e.getSource()==submit){
            String name=patient_name_field.getText();
            String cname=patient_father_name_field.getText();
            String id=lidno.getText();
            try {
                String query = "insert into medicine values('" + name + "','" + cname + "','"+ id +"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully Added");
                setVisible(false);
            } catch (Exception ae) {
                ae.printStackTrace();
            }








            setVisible(false);

        } else if (e.getSource()==cancel) {
            setVisible(false);

        }

    }
}
