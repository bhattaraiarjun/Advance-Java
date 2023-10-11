package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;


public class passwordField extends JFrame{
    passwordField(){
        JPasswordField jPasswordField = new JPasswordField();
        JPasswordField jPasswordField2 = new JPasswordField(20);
        JPasswordField jPasswordField3 = new JPasswordField("Hello");//prefill
        JPasswordField jPasswordField4= new JPasswordField("helloooo",20);

        add(jPasswordField);
        add(jPasswordField2);
        add(jPasswordField3);
        add(jPasswordField4);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("HelloWorld");
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new passwordField();
    }




}