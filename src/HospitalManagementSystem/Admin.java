package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    Admin() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/adminwall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        /*this is menu and frame */

        JMenuBar menu = new JMenuBar();

        /*patients mane with two option*/
        JMenu patient = new JMenu("Patient");
        JMenuItem add_patient = new JMenuItem("Add Patient");
        JMenuItem view_patient = new JMenuItem("View Patient");
        patient.add(view_patient);
        patient.add(add_patient);
        add_patient.addActionListener(this);
        view_patient.addActionListener(this);
        /*staff menu with two operation */
        JMenu staff = new JMenu("Staff");
        JMenuItem add_staff = new JMenuItem("Add Staff");
        JMenuItem view_staff = new JMenuItem("View Staff");
        staff.add(add_staff);
        staff.add(view_staff);
        add_staff.addActionListener(this);
        view_staff.addActionListener(this);
        /*Pharmacy adding in menu bar*/
        JMenu pharmacy = new JMenu("Pharmacy");
        JMenuItem add_pharmacy = new JMenuItem("Add Pharmacy");
        JMenuItem view_pharmacy = new JMenuItem("View Pharmacy");
        pharmacy.add(add_pharmacy);
        pharmacy.add(view_pharmacy);
        add_pharmacy.addActionListener(this);
        view_pharmacy.addActionListener(this);

        JMenu password = new JMenu("Change Password");
        JMenuItem auto_password = new JMenuItem("Authenticate Password");
        JMenuItem admin_password = new JMenuItem("Admin Password");
        JMenuItem rec_password = new JMenuItem("Receptionist Password");
        JMenuItem pha_password = new JMenuItem("Pharmacy Password");
        JMenuItem pat_password = new JMenuItem("Patient Password");
        auto_password.addActionListener(this);
        admin_password.addActionListener(this);
        rec_password.addActionListener(this);
        pha_password.addActionListener(this);
        pat_password.addActionListener(this);
        password.add(admin_password);
        password.add(auto_password);
        password.add(rec_password);
        password.add(pha_password);
        password.add(rec_password);
        password.add(pat_password);

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
        menu.add(pharmacy);
        menu.add(password);
        menu.add(help);
        menu.add(setting);


        setSize(1400, 800);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Admin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String m = e.getActionCommand();
        if (m.equals("Add Patient")) {

            new AddPatient();
        } else if (m.equals("View Patient")) {

            new PatientDetails();
        } else if (m.equals("Add Staff")) {

            new AddStaff();
        } else if (m.equals("View Staff")) {

            new StaffDetails();
        } else if (m.equals("Add Pharmacy")) {

            new AddPharmacy();
        } else if (m.equals("View Pharmacy")) {

            new PharmacyDetails();
        } else if (m.equals("Authenticate Password")) {
            new ChangePassword();


        } else if (m.equals("Admin Password")) {
            new ChangePassword();

        } else if (m.equals("Receptionist Password")) {
            new ChangePassword();

        } else if (m.equals("Pharmacy Password")) {
            new ChangePassword();

        } else if (m.equals("Patient Password")) {
            new ChangePassword();

        } else if (m.equals("About")) {
            new About();


        } else if (m.equals("Need Help")) {
            new NeedHelp();


        } else if (m.equals("FAQ")) {
            new FAQ();


        } else if (m.equals("Logout")) {
            setVisible(false);
            new Home();

        }else if (m.equals("Close Application")){
           System.exit(0);
        }
    }
}
