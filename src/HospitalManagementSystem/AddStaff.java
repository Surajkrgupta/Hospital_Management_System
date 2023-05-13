package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddStaff extends JFrame implements ActionListener {
    JTextField Staff_name_field, Staff_father_name_field, Staff_phone_field, Staff_mail_field, Staff_doc_field, Staff_address_field, Staff_pincode_field;
    JButton submit, cancle;
    JLabel lidno;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddStaff() {
        setLayout(null);

        JLabel heading = new JLabel("New Staff's Details");
        heading.setFont(new Font("Arial", Font.BOLD, 50));
        heading.setBounds(450, 20, 800, 50);
        add(heading);

        /*this is label for name*/
        JLabel Staff_name_label = new JLabel("Staff's name *");
        Staff_name_label.setBounds(300, 150, 100, 30);
        add(Staff_name_label);
        Staff_name_field = new JTextField();
        Staff_name_field.setBounds(450, 150, 150, 30);
        add(Staff_name_field);


        /*thsi label refer to father details*/
        JLabel Staff_father_name_label = new JLabel("father's Name");
        Staff_father_name_label.setBounds(650, 150, 200, 30);
        add(Staff_father_name_label);
        Staff_father_name_field = new JTextField();
        Staff_father_name_field.setBounds(850, 150, 150, 30);
        add(Staff_father_name_field);


        /*this label holdes there id  and it wiil be genrated by random funcation*/
        JLabel Staff_id_label = new JLabel("Staff's ID *");
        Staff_id_label.setBounds(300, 250, 200, 30);
        add(Staff_id_label);
        lidno = new JLabel("1111" + first4);
        lidno.setBounds(450, 250, 250, 30);
        add(lidno);



        /*thisi is label is refer to the Staff mobile number details*/
        JLabel Staff_phone_label = new JLabel("Contact No: *");
        Staff_phone_label.setBounds(650, 250, 200, 30);
        add(Staff_phone_label);
        Staff_phone_field = new JTextField();
        Staff_phone_field.setBounds(850, 250, 150, 30);
        add(Staff_phone_field);


        /*e-mail id */
        JLabel Staff_mail_label = new JLabel("Staff's mail");
        Staff_mail_label.setBounds(300, 350, 150, 30);
        add(Staff_mail_label);
        Staff_mail_field = new JTextField();
        Staff_mail_field.setBounds(450, 350, 150, 30);
        add(Staff_mail_field);


        /*this level of code hends the Staffs docoument*/
        JLabel Staff_doc_label = new JLabel("Adhar No:");
        Staff_doc_label.setBounds(650, 350, 150, 30);
        add(Staff_doc_label);
        Staff_doc_field = new JTextField();
        Staff_doc_field.setBounds(850, 350, 150, 30);
        add(Staff_doc_field);


        /*this code is used to take address of the Staff*/
        JLabel Staff_address_label = new JLabel("Full address");
        Staff_address_label.setBounds(300, 450, 150, 30);
        add(Staff_address_label);
        Staff_address_field = new JTextField();
        Staff_address_field.setBounds(450, 450, 150, 30);
        add(Staff_address_field);



        /*this code is used to have pincode of the adderss*/
        JLabel Staff_pincode_label = new JLabel("Pin-Code");
        Staff_pincode_label.setBounds(650, 450, 150, 30);
        add(Staff_pincode_label);
        Staff_pincode_field = new JTextField();
        Staff_pincode_field.setBounds(850, 450, 150, 30);
        add(Staff_pincode_field);






        /*there are only one OR TWO button to submit the details*/
        submit = new JButton("SUBMIT");
        submit.setBounds(500, 600, 120, 30);
        add(submit);
        submit.addActionListener(this);
        cancle = new JButton("CANCEL");
        cancle.setBounds(700, 600, 120, 30);
        add(cancle);
        cancle.addActionListener(this);


        /*below this ine the frame command will be run*/
        setSize(1400, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddStaff();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = Staff_name_field.getText();
            String f_name = Staff_father_name_field.getText();
            String p_id = lidno.getText();
            String mail = Staff_mail_field.getText();
            String p_con = Staff_phone_field.getText();
            String p_adhar = Staff_doc_field.getText();
            String p_add = Staff_address_field.getText();
            String p_pin = Staff_pincode_field.getText();
            try {
                String query = "insert into Staff values('" + name + "','" + f_name + "','" + p_id + "','" + mail + "','" + p_con + "','" + p_adhar + "','" + p_add + "','" + p_pin + "')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Successfully Added");
                setVisible(false);
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        if (e.getSource() == cancle) {
            setVisible(false);
        }

    }
}
