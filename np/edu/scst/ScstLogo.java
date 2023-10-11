package np.edu.scst;

import javax.swing.*;
import java.awt.*;


public class ScstLogo extends JFrame {
    public ScstLogo(){
        ImageIcon imageicon = new ImageIcon("./scstlogo.webp");

        JLabel jLabel = new JLabel(imageicon);
        JLabel label = new JLabel("hello");
        add(jLabel);
        add(label);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("ImageDemo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new ScstLogo();
    }
}
