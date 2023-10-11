package np.edu.scst;

import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
public class ColorDemo extends JFrame {
    ColorDemo(){
       JButton b1= new JButton("click me");
       //JLabel J1= new JLabel("gcghcc");


        add (b1);
       // add(J1);

        b1.setBackground(new Color(241, 166, 52));


        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Color Demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        ColorDemo obj =new ColorDemo();

    }
}
