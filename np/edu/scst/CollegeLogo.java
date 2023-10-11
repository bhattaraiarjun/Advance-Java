package np.edu.scst;


import javax.swing.*;
import java.awt.*;

public class CollegeLogo extends JFrame {
    public CollegeLogo() {
        setTitle("College logo");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("logo.jpg");
        JLabel label = new JLabel("", imageIcon, JLabel.CENTER);
        getContentPane().add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CollegeLogo cl = new CollegeLogo();
        cl.setVisible(true);
    }
}

