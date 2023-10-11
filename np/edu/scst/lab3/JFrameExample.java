package np.edu.scst.lab3;

import javax.swing.*;
import java.awt.*;

//import java.awt.*;

public class JFrameExample extends  JFrame{
    //static GraphicsConfiguration gc;

    JFrameExample(){
        JLabel label= new JLabel("Hello i am jLabel");
        JLabel label2= new JLabel("Hello2");
        JTextField txt = new JTextField(10);
        JButton btn = new JButton("Hit Me");
        JTextArea text = new JTextArea(2,5);

        add(label);
        add(label2);
        add(btn);
        add( text);
        add(txt);

        setVisible(true);
        setTitle("Sirsak");
        setSize(700,700);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);

    }


    public static void main(String[] args) {
        new JFrameExample();


    }
}
