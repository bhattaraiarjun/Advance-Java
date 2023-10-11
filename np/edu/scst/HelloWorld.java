package np.edu.scst;
import javax.swing.*;
import java.awt.*;

class HelloWorld extends JFrame  {

    HelloWorld(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JLabel label= new JLabel("Hello world");

        panel.add(label);
        add(panel);


        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Hello in Jlabel");
        setSize(450,450);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new HelloWorld();

    }
}