package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;

public class ChangePassword extends JFrame {

    ChangePassword(){

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("image//commingsoon.jpg"));
        Image background2 = background.getImage().getScaledInstance(600, 320, Image.SCALE_DEFAULT);
        ImageIcon back3 = new ImageIcon(background2);
        JLabel backgroundLabel = new JLabel(back3);
        add(backgroundLabel);







        setResizable(false);
        setLocation(400,200);
        setSize(500, 350);
        setVisible(true);
    }



    public static void main(String[] args) {
        new ChangePassword();
    }
}
