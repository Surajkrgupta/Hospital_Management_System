
package HospitalManagementSystem;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;

    public Splash() {

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("image//loading.jpg"));
        Image background2 = background.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon back3 = new ImageIcon(background2);
        JLabel backgroundLabel = new JLabel(back3);
        add(backgroundLabel);

        setResizable(false);
        setLocation(380, 160);
        setSize(600, 500);
        t = new Thread(this);
        t.start();
        setVisible(true);

    }

    public void run() {

        try {
            Thread.sleep(3000);
            setVisible(false);
            new Authenticate();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
