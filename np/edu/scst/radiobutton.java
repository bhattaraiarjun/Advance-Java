package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;

public class radiobutton extends JFrame{
    radiobutton(){
       // JRadioButton jRadioButton = new JRadioButton();
//        JRadioButton jRadioButton2 = new JRadioButton("test");
//        JRadioButton jRadioButton3 = new JRadioButton("test2",true);
        JRadioButton jRadioButton4 = new JRadioButton("male");
        JRadioButton jRadioButton5 = new JRadioButton("female");
        JRadioButton jRadioButton6 = new JRadioButton("other");

        ButtonGroup btButtonGroup = new ButtonGroup();
        btButtonGroup.add(jRadioButton4);
        btButtonGroup.add(jRadioButton5);
        btButtonGroup.add(jRadioButton6);



//        add(jRadioButton2);
//        add(jRadioButton3);
      //  add(jRadioButton);
        add(jRadioButton4);
        add(jRadioButton5);
        add(jRadioButton6);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("RadioButton");
        setSize(450,450);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new radiobutton();
    }

}