package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;

public class FAQ extends JFrame {

    FAQ(){

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("image//commingsoon.jpg"));
        Image background2 = background.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon back3 = new ImageIcon(background2);
        JLabel backgroundLabel = new JLabel(back3);
        add(backgroundLabel);






        setVisible(true);
        setSize(600,400);
        setLocation(400,200);
        setResizable(false);
    }


    public static void main(String[] args) {
        new FAQ();
    }
}
