package np.edu.scst;

import java.awt.*;
import javax.swing.*;


public class jTextArea extends JFrame{
    jTextArea(){
        JTextArea jTextArea = new JTextArea();
        JTextArea jTextArea1 = new JTextArea(3,10);
        JTextArea jTextArea2 = new JTextArea("hello");
        JTextArea jTextArea3 = new JTextArea("hello",3,10);

        add(jTextArea);
        add(jTextArea1);
        add(jTextArea2);
        add(jTextArea3);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("HelloWorld");
        setSize(450,450);
        setDefaultCloseOperation(3);

    }
    public static void main(String[] args) {
        new jTextArea();
    }


}