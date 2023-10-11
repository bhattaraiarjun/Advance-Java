package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;
public class jSlider extends JFrame {

    jSlider(){
        JSlider jSlider = new JSlider();
        JSlider jSlider1 = new JSlider(0);
        JSlider jSlider2 = new JSlider(1);
        JSlider jSlider3 = new JSlider(0,10,3);
        JSlider jSlider4 = new JSlider(1,0,10,7);


       add(jSlider);
       add(jSlider1);
       add(jSlider2);
       add(jSlider3);
       add(jSlider4);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("ProgressBar");
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new jSlider();
    }
}

