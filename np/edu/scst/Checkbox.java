
package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;

public class Checkbox extends JFrame {
    Checkbox(){
        
        JCheckBox jCheckBox = new JCheckBox();
        JCheckBox jCheckBox2 = new JCheckBox("test");
        JCheckBox jCheckBox3 = new JCheckBox("test2",true);
        JCheckBox jCheckBox4 = new JCheckBox("male");
        JCheckBox jCheckBox5 = new JCheckBox("female");
        JCheckBox jCheckBox6 = new JCheckBox("other");
        ButtonGroup btButtonGroup = new ButtonGroup();
        btButtonGroup.add(jCheckBox4);
        btButtonGroup.add(jCheckBox5);
        btButtonGroup.add(jCheckBox6);
        
     
        
        add(jCheckBox);
        add(jCheckBox2);
        add(jCheckBox3);
        add(jCheckBox4);
        add(jCheckBox5);
        add(jCheckBox6);
        
    setLayout(new FlowLayout());
    setVisible(true);
    setTitle("HelloWorld");
    setSize(450,450);
    setDefaultCloseOperation(3); //kill the process on clicking close button
    }
    public static void main(String[] args) {
        new Checkbox();
    }
    
} 
    

