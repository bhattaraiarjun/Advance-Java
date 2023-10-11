package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class FowLayoutDemo extends JFrame{
    //Layout = arrangement of component

    FowLayoutDemo(){

        JLabel jLabel= new JLabel("Hello 1");
        JLabel jLabel2 = new JLabel("Hello 2");
        JButton jButton= new JButton("Button1");
        JButton jButton2= new JButton("Button2");


        add(jLabel);
        add(jLabel2);
        add(jButton);
        add(jButton2);

        //flow layout makes sure that the component stay near the center

        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setTitle("Flow layout demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FowLayoutDemo();
    }
}
