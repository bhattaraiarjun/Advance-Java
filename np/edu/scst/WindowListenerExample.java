package np.edu.scst;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class WindowListenerExample extends JFrame {
    WindowListenerExample(){

        setTitle("Window Listener Demo");
        setSize(450, 450);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new MyWindowListener()); // add a new instance of MyWindowListener to the JFrame

    }

    private class MyWindowListener extends WindowAdapter {
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closing");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("Window closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Window de-iconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Window activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window deactivated");
        }
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
