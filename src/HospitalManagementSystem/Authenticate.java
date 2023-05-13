package HospitalManagementSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Authenticate extends JFrame implements ActionListener {
    JButton authenticate;
    JPasswordField text_password;

    public Authenticate() {
        setLayout(null);


        /* this class is Refer only for Verification by user before doing any task in the Software */

        setSize(1200, 700);
        JLabel autho_heading = new JLabel("AUTHENTICATE");
        autho_heading.setFont(new Font("Forte",Font.PLAIN, 30));

        autho_heading.setBounds(75, 20, 300, 40);
        autho_heading.setBackground(Color.BLUE);
        autho_heading.setForeground(Color.red);
        add(autho_heading);

        JLabel label_password = new JLabel("HOSPITAL PASSWORD");
        add(label_password);
        text_password = new JPasswordField();
        text_password.setBounds(117, 120, 150, 35);
        text_password.setFont(new Font("Arial", Font.BOLD, 15));

        add(text_password);

        /* there are only one single Button to authenticate */

        authenticate = new JButton("AUTHENTICATE");
        authenticate.setFont(new Font("Arial", Font.BOLD, 15));
        authenticate.setBounds(117, 300, 150, 50);
        authenticate.setBackground(Color.BLACK);
        authenticate.setForeground(Color.WHITE);
        add(authenticate);

        authenticate.addActionListener(this);
        this.getRootPane().setDefaultButton(authenticate);


        setResizable(false);
        setLocation(485, 140);
        setSize(400, 450);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Authenticate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == authenticate) {

            String password=String.valueOf(text_password.getPassword());
            String query = "select * from authenticate where password='" + password + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Home();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password");
                    setVisible(true);
                }
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
    }
}
