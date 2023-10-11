package np.edu.scst.registrationform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFormDemo extends JFrame {

    RegistrationFormDemo(){
        JLabel jLabel= new JLabel("Username");
        JLabel jLabel2= new JLabel("Password");
        JTextField i1= new JTextField(20);
        JPasswordField i2= new JPasswordField(20);
        JButton b1 = new JButton("Submit");
        //JTextField output = new JTextField(5);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jLabel.getText();
                String pass = jLabel2.getText();
                //output.setText("Name= "+name+ "Password="+pass);

            }
        });

        setLayout(null);
        add(jLabel);
        add(jLabel2);add(i1); add(i2); add(b1);
        //  coordinates
        jLabel.setBounds(10,10,200,20);
        jLabel2.setBounds(10,50,200,20);
        i1.setBounds(250,10,200,20);
        i2.setBounds(250,50,200,20);
        b1.setBounds(250,100,200,20);


        setSize(500,500);
        setVisible(true);
        setTitle("Registration Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new RegistrationFormDemo();
    }

}
