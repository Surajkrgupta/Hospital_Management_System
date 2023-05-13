package HospitalManagementSystem;

import org.jdom.JDOMFactory;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){
        setLayout(null);

        JLabel head=new JLabel("Hospital Management System");
        head.setFont(new Font("Elephant", Font.BOLD, 25));
        head.setBounds(85,-15,1000,100);
        add(head);

        JLabel ver=new JLabel("V 1.0.0");
        ver.setFont(new Font("Elephant", Font.PLAIN, 15));
        ver.setBounds(260,50,1000,25);
        add(ver);


        JLabel head1=new JLabel("<html><p>The healthcare industry is one of the most important sectors of our economy. It is responsible for providing\n care to hundreds and billions of people around the world. The health of all people is paramount to their well-being, which means that the healthcare industry is an important part of society as a whole.<p></html>");
        head1.setFont(new Font("Elephant", Font.PLAIN, 15));
        head1.setBounds(5,70,1000,25);
        add(head1);


        JLabel head2=new JLabel("Technology has played an increasingly more important role in the delivery of healthcare. Hospital management system has emerged\n to be an evolving healthcare technology trend in recent times. A HMS is a comprehensive solution for healthcare facilities to gather patient data, secure vital records,\n automate scheduling, and more!");
        head2.setFont(new Font("Elephant", Font.PLAIN, 15));
        head2.setBounds(5,100,1000,25);
        add(head2);










        setVisible(true);
        setSize(600,400);
        setLocation(400,200);
        setResizable(false);
    }


    public static void main(String[] args) {
        new About();
    }
}
