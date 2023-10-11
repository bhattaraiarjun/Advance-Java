package np.edu.scst;

import java.awt.FlowLayout;
import javax.swing.*;


public class jTable extends JFrame {
    jTable(){
        String[] head = {"Name","Age","Location"};
        String[][] body = {{"A","23","lalitpur"},
                {"B","21","Kathmandu"},
                {"C","22","Lalitpur"},
                {"D","22","Bhaktapur"}};

        JTable jTable = new JTable(body,head);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);


        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Table");
        setSize(450,450);
        setDefaultCloseOperation(3);

    }
    public static void main(String[] args) {
        new jTable();
    }
}