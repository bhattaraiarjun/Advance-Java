package np.edu.scst;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class MouseListenerDemo extends JFrame {
    MouseListenerDemo(){
        JButton jButton= new JButton("Hit Me");
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(" Mouse clicked");

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");

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
        new MouseListenerDemo();
    }

}
