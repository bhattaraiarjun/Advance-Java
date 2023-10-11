package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class LayoutCardDemo extends JFrame {
    //layout= arrangement of components
    LayoutCardDemo(){

        JLabel jLabel= new JLabel("hello 1");
        JLabel jLabel2 = new JLabel("HELLO 2qsa");

        add(jLabel);
        add(jLabel2);

        //swing's default layout is Null Layout
        //null Layout= shows only the latest element
        //Card layout = imposes one component over another

        setLayout(new CardLayout());       // notice that we have used card layout here
        setSize(500,500);
        setVisible(true);
        setTitle("Card layout demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new LayoutCardDemo();
    }
}
