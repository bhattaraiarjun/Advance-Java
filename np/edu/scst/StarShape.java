package np.edu.scst;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StarShape extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Star shape
        int[] xPoints = {0,40,50,60,100,60,50,40,0};
        int[] yPoints = {50,40,0,40,50,60,100,60,50};
        int nPoints = 9;
        g.drawPolygon(xPoints, yPoints, nPoints);

        //Rectangle
        g.drawRect(90,90,200,200);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Star Shape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StarShape());
        frame.setSize(450, 450);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

