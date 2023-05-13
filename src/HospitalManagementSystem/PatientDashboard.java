package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PatientDashboard extends JFrame implements ActionListener {

    PatientDashboard(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/wallpaper.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);



        JMenuBar menu = new JMenuBar();

        /*patients mane with two option*/
        JMenu patient = new JMenu("Profile");
        JMenuItem add_patient = new JMenuItem("Update Profile");
        JMenuItem view_patient = new JMenuItem("View Profile");
        patient.add(view_patient);
        patient.add(add_patient);
        add_patient.addActionListener(this);
        view_patient.addActionListener(this);
        /*staff menu with two operation */
        JMenu staff = new JMenu("Appointment");
        JMenuItem add_staff = new JMenuItem("New Appointment");
        JMenuItem view_staff = new JMenuItem("View Appointment");
        staff.add(add_staff);
        staff.add(view_staff);
        add_staff.addActionListener(this);
        view_staff.addActionListener(this);



        JMenu help = new JMenu("Help");
        JMenuItem needhelp = new JMenuItem("Need Help");
        JMenuItem faq = new JMenuItem("FAQ");
        JMenuItem about = new JMenuItem("About");
        needhelp.addActionListener(this);
        faq.addActionListener(this);
        about.addActionListener(this);
        help.add(needhelp);
        help.add(faq);
        help.add(about);
        JMenu setting = new JMenu("Setting");
        JMenuItem logout = new JMenuItem("Logout");
        JMenuItem close = new JMenuItem("Close Application");
        setting.add(logout);
        setting.add(close);

        logout.addActionListener(this);
        close.addActionListener(this);


        /*adding all menu in menu bar option*/
        setJMenuBar(menu);

        menu.add(patient);
        menu.add(staff);
        menu.add(help);
        menu.add(setting);
        setSize(1400, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PatientDashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String m = e.getActionCommand();

        if (m.equals("Update Profile")) {

            //new UpdatePatient();
        } else if (m.equals("View Profile")) {


        } else if (m.equals("New Appointment")) {

            new NewAppointment();
        } else if (m.equals("View Appointment")) {


        } else if (m.equals("Patient Password")) {
                    new ChangePassword();

        } else if (m.equals("Need Help")) {
            new NeedHelp();


        } else if (m.equals("FAQ")) {
            new FAQ();


        } else if (m.equals("About")) {
            new About();


        }else if (m.equals("Logout")) {
            setVisible(false);
            new Home();

        }else if (m.equals("Close Application")){
            System.exit(0);
        }
    }
}
