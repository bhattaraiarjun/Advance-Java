package np.edu.scst;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class KeyListener extends  JFrame {
    KeyListener(){

        JTextField field = new JTextField(20);
        field.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("key typed");

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key Pressed");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key Released");

            }
        });

        add(field);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Key Listener");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new KeyListener();

    }
}
