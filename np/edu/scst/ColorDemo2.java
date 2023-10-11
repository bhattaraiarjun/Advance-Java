package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class ColorDemo2 extends JFrame {
    JButton red;
    JButton blue;
    JButton green;
    JButton redOpaque;
    JButton redTrnsprnt;

    ColorDemo2() {
        red = new JButton("red");
        blue = new JButton("blue");
        green = new JButton("green");
        redOpaque = new JButton("redOpaq");
        redTrnsprnt = new JButton("redTrnsprnt");

        red.setBackground(new Color(255, 0, 0));
        blue.setBackground(new Color(0, 0, 255));
        green.setBackground(new Color(0, 255, 0));
        redOpaque.setBackground(new Color(255, 0, 0, 255));
        redTrnsprnt.setBackground(new Color(134, 26, 26));

        JPanel panel = new JPanel();
        panel.add(red);
        panel.add(blue);
        panel.add(green);
        panel.add(redOpaque);
        panel.add(redTrnsprnt);

        add(panel);
        setLayout(new FlowLayout());
        setTitle("Color Demo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ColorDemo2 obj = new ColorDemo2();
    }
}
