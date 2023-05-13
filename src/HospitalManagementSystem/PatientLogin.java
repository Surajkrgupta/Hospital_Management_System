package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PatientLogin extends JFrame implements ActionListener {

    JButton login_button;
    JTextField username_field;
    JPasswordField password_field;

    public PatientLogin() {
        setLayout(null);

        JLabel login_heading = new JLabel("LOGIN");
        login_heading.setBounds(170, 10, 200, 10);
        add(login_heading);


        /*this is username and its text filed */
        JLabel username_text = new JLabel("USER ID :");
        username_text.setBounds(70, 50, 120, 20);
        add(username_text);
        username_field = new JTextField();
        username_field.setBounds(160, 50, 150, 20);
        add(username_field);


        /*this is password and its text filed*/
        JLabel password_text = new JLabel("PASSWORD :");
        add(password_text);
        password_text.setBounds(70, 110, 120, 20);
        password_field = new JPasswordField();
        password_field.setBounds(160, 110, 150, 20);
        add(password_field);


        /* there are only one single butane to authenticate */
        login_button = new JButton("LOGIN");
        login_button.setBounds(135, 170, 120, 30);
        login_button.setBackground(Color.BLACK);
        login_button.setForeground(Color.WHITE);
        add(login_button);
        login_button.addActionListener(this);
        setResizable(false);
        setLocation(485, 220);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PatientLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login_button) {
            String username = username_field.getText();
            String password = password_field.getText();
            String query = "select * from patient where PATIENT_ID='" + username + "'and PATIENT_PHONE='" + password + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new PatientDashboard();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or Password");
                    setVisible(false);
                    new PatientLogin();
                }
            } catch (Exception ae) {
                ae.printStackTrace();

            }


        }
    }
}
