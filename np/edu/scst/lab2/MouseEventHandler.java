package np.edu.scst.lab2;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class MouseEventHandler  extends JFrame {
    MouseEventHandler(){
        JButton jButton= new JButton("Hit Me");
        jButton.addMouseListener(new java.awt.event.MouseListener() {
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
        setTitle("Mouse Event Handler");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseEventHandler();
    }

}

