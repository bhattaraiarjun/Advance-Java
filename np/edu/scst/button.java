package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;

public class button extends JFrame{
    button(){

        JButton jButton =  new JButton();
        JButton jButton2 =  new JButton("click me");

        add(jButton);
        add(jButton2);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("HelloWorld");
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new button();
    }

}