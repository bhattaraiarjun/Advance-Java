package np.edu.scst.lab2;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo (){

        //grid layout makes sure that the component stay in tabular grids of rows and columns
        JLabel label =new JLabel("label");
        JLabel label2 =new JLabel("label2");
        JLabel label3 =new JLabel("label3");
        JLabel label4 =new JLabel("label4");
        JLabel label5 =new JLabel("label5");
        JLabel label6 =new JLabel("label6");

        add(label);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);

        setLayout(new GridLayout(2,3));
        setSize(600,600);
        setVisible(true);
        setTitle("Grid layout demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}

