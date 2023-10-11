package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo(){
        JButton button3 =new JButton("South");
        JButton button4 =new JButton("East");
        JButton button5 =new JButton("Center");
        JButton button1 =new JButton("North");
        JButton button2 =new JButton("West");


        //border layout arranges the components in form of direction of compass
        setLayout(new BorderLayout());
        add(button3, BorderLayout.SOUTH);
        add(button4, BorderLayout.EAST);
        add(button5, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.WEST);


        setSize(500,500);
        setVisible(true);
        setTitle("Border layout demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
