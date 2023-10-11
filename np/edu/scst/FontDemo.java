package np.edu.scst;

import javax.swing.*;
import java.awt.*;

public class FontDemo extends JFrame {

     FontDemo() {
        //font family:serif SnsSerif Dialog DialogInput Monospace
        //font style: PLAIN BOLD ITALIC BOLD|ITALIC

        JLabel j1 = new JLabel("Hello i'm Serif Plain text.");
        JLabel j2 = new JLabel("Hello i'm Sans serif Bold.");
        JLabel j3 = new JLabel("Hello i'm Italic.");
        JLabel j4 = new JLabel("Hello i'm Bold Italic.");
        JLabel j5 = new JLabel("Hello i'm Monospaced plain text.");
        //                      family      style      size
        j1.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        j2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        j3.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
        j4.setFont(new Font(Font.DIALOG,Font.BOLD|Font.ITALIC,20));
        j5.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));


        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);

        setLayout(new GridLayout(5,1));
        //setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font family and demo");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FontDemo();
    }

}
