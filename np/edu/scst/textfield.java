package np.edu.scst;

import org.w3c.dom.ls.LSOutput;

import java.awt.FlowLayout;
import javax.swing.*;

public class textfield  extends JFrame{
    textfield(){
        JTextField jTextField = new JTextField();
        JTextField jTextField2 = new JTextField(20);
        JTextField jTextField3 = new JTextField("Hello");
        JTextField jTextField4 = new JTextField("Hello",20);

        add(jTextField);
        add(jTextField2);
        add(jTextField3);
        add(jTextField4);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("HelloWorld");
        setSize(450,450);
        setDefaultCloseOperation(3);

    }
    public static void main(String[] args) {
        new textfield();
    }


}