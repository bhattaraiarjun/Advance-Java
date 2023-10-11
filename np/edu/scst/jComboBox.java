package np.edu.scst;
import java.awt.FlowLayout;
import javax.swing.*;

public class jComboBox extends JFrame {
    jComboBox() {
        String[] countries = {"Nepal", "India", "China"};
        JComboBox jComboBox = new JComboBox();
        JComboBox jComboBox2 = new JComboBox(countries);
        JComboBox jComboBox3 = new JComboBox(countries);


        jComboBox3.setSelectedIndex(2);//select items using array index
        add(jComboBox);
        add(jComboBox2);
        add(jComboBox3);


        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("ComboBox");
        setSize(450, 450);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new jComboBox();
    }
}
