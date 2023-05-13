package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;

public class NeedHelp extends JFrame {

    NeedHelp(){

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("image//commingsoon.jpg"));
        Image background2 = background.getImage().getScaledInstance(600, 320, Image.SCALE_DEFAULT);
        ImageIcon back3 = new ImageIcon(background2);
        JLabel backgroundLabel = new JLabel(back3);
        add(backgroundLabel);

        JLabel pat=new JLabel("For Patient");
        pat.setBounds(3, -20, 0, 0);
        add(pat);

        JLabel pata=new JLabel("Answer");
        pata.setBounds(3, -20, 0, 0);
        add(pata);

        JLabel hos=new JLabel("For Hospital");
        hos.setBounds(3, -20, 0, 0);
        add(hos);

        JLabel hosa=new JLabel("Andwer");
        hosa.setBounds(3, -20, 0, 0);
        add(hosa);

        JLabel adm=new JLabel("For Admin");
        adm.setBounds(3, -20, 0, 0);
        add(adm);

        JLabel admi=new JLabel("ANswr");
        admi.setBounds(3, -20, 0, 0);
        add(admi);












        setVisible(true);
        setSize(600,400);
        setLocation(400,200);
        setResizable(false);
    }




    public static void main(String[] args) {
        new NeedHelp();
    }
}
