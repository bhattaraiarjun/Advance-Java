package np.edu.scst;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class MouseAdapterDemo extends JFrame {
    MouseAdapterDemo(){
        JButton jButton= new JButton("click");
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse clicked");

            }


        });
        add(jButton);

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font Demo");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
