package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;
public class jProgressBar extends JFrame {

    jProgressBar(){

        JProgressBar jProgressBar = new JProgressBar();
        JProgressBar jProgressBar1 = new JProgressBar(0);
        JProgressBar jProgressBar2 = new JProgressBar(1);
        JProgressBar jProgressBar3 = new JProgressBar(0,100);
        JProgressBar jProgressBar4 = new JProgressBar(1,0,100);

        add(jProgressBar);
        add(jProgressBar1);
        add(jProgressBar2);
        add(jProgressBar3);
        add(jProgressBar4);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("ProgressBar");
        setSize(450,450);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new jProgressBar();
    }
}

