package np.edu.scst;

import sun.awt.CGraphicsConfig;

import javax.swing.*;
import java.awt.*;

public class ImageDemo extends JFrame {

    ImageDemo() {


        ImageIcon imageicon = new ImageIcon("scstlogo.webp");
        JLabel jLabel = new JLabel(imageicon);
        add(jLabel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("ImageDemo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {

        new ImageDemo();
    }

}
