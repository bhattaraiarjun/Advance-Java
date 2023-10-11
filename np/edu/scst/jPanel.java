package np.edu.scst;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
public class jPanel extends JFrame{
    jPanel(){

        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel(new FlowLayout());

        jPanel.setBackground(Color.yellow);

        add(jPanel);
        JLabel jLabel= new JLabel("I am jLabel and i am inside jPanel");
        jPanel.add(jLabel);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Jframe");
        setSize(450,450);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        
        new jPanel();
    }
    
}
