package np.edu.scst;

import javax.swing.*;
import java.awt.FlowLayout;

public class jlavel extends JFrame {
    jlavel() {
        JLabel jLabel = new JLabel("Hello");
        JLabel jLabel2= new JLabel("sansar");
        add(jLabel);
        add(jLabel2);
        setLayout(new FlowLayout());

        setVisible(true);
        setTitle("jLevel title goes here");
        setSize(450, 450);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new jlavel();
    }
}
