package np.edu.scst;
import javax.swing.*;
import java.awt.*;


public class Classwork1 extends JFrame{
    Classwork1(){

        JTextArea jTextArea1 = new JTextArea(1,3);
        JTextArea jTextArea2 = new JTextArea(1,3);

        JButton jButton2 =  new JButton("Add");

        add(jTextArea1);
        add(jTextArea2);
        add(jButton2);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("HelloWorld");
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Classwork1 obj= new Classwork1();
    }
}

