package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo (){

        //grid layout makes sure that the component stay in tabular grids of rows and columns
        JButton button1 =new JButton("Button1");
        JButton button2 =new JButton("Button2");
        JButton button3 =new JButton("Button3");
        JTextArea text =new JTextArea("Text Area");

//        JLabel label =new JLabel("label");
//        JLabel label2 =new JLabel("label2");
//        JLabel label3 =new JLabel("label3");
//        JLabel label4 =new JLabel("label4");



        // JPanel panel =new JPanel(new GridLayout(2,3));
//
//        add(label);
//        add(label2);
//        add(label3);
//        add(label4);

        add(button1);
        add(button2);
        add(button3);
        add(text);


        setLayout(new GridLayout(3,2));
        setSize(500,500);
        setVisible(true);
        setTitle("Grid layout demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
