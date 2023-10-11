package np.edu.scst;

import javax.swing.*;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class TwoDshape extends JFrame{

    public TwoDshape(){

        JPanel jPanel= new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g.create();
                //x1,y1, x2,y2
//                g2.drawLine(1,1,135,135);
//                g2.setColor(Color.red);
//                g2.drawLine(50,50,385,385);
                g2.drawRect(50,50,400,450);
//                g2.drawOval(300, 40, 400, 80);
//                g2.drawOval(300, 300, 400, 400);

//polygon
//            int[] x={250,400,400,100,100};
//            int[]y={400,300,200,200,300};
//            g2.drawPolygon(x,y,5);
//
////triangle using polygon
//            int[] x2={200,200,400};
//            int[]y2={100,300,300};
//            g2.drawPolygon(x2,y2,3);
//
////triangle with lines
//                g2.setColor(Color.red);
//                g2.drawLine(100, 100, 150, 200);
//                g2.setColor(Color.cyan);
//                g2.drawLine(150, 200, 200, 100);
//                g2.setColor(Color.green);
//                g2.drawLine(200, 100, 100, 100);

            }

        };

        add(jPanel);
        setVisible(true);
        setTitle("2D shape");
        setSize(450,450);
        setDefaultCloseOperation(3);
        
        }
        public static void main(String[] args) {

        TwoDshape s= new TwoDshape();
        }
}