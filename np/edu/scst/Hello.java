package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame {

    public Hello() {
        // Creating a JPanel with a cyan background
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        // Creating a JLabel with "Hello World"
       // JLabel label1 = new JLabel("Hello World!");
        JButton label = new JButton("click me");
        label.setBackground(new Color(255,200,134));
        ImageIcon image = new ImageIcon("logo.jpg");
          label.setIcon(image);

        // Adding the JLabel to the JPanel
        panel.add(label);
       // panel.add(label1);



        // Adding the JPanel to the JFrame
        add(panel);

        // JFrame properties
        setLayout(new FlowLayout());
        setTitle("Hello World");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hello();
    }
}
