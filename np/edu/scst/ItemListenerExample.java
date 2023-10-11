package np.edu.scst;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class ItemListenerExample extends JFrame {
    ItemListenerExample(){

        JCheckBox checkBox = new JCheckBox("Check me");
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox is checked");
                } else {
                    System.out.println("Checkbox is unchecked");
                }
            }
        });

        add(checkBox);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Item Listener Demo");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ItemListenerExample();

    }
}
