package np.edu.scst;

import javax.swing.*;

import java.awt.*;

import static javax.swing.text.StyleConstants.setIcon;

public class MyWindow extends JFrame {
    
    public MyWindow() {
        setBackground(new Color(255,0,254));
        JButton button =new JButton("Aqua");
        button.setBackground(new Color(0,255,255));

        setTitle("My Window");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(450,450);
        setDefaultCloseOperation(MyWindow.EXIT_ON_CLOSE);
        add(button);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
