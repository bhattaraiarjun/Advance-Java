package np.edu.scst;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SumSub extends JFrame{
    SumSub(){
        JTextField input1 = new JTextField(20);
        JTextField input2 = new JTextField(20);

        JButton jButton1 = new JButton("Sum");
        JButton jButton2 = new JButton("Sub");
        JTextField output = new JTextField(10);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                int result = num1+num2;
                output.setText(String.valueOf(result));
            }

        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
//                String num1 = input1.getText();
//                String num2 = input2.getText();
//                int number1 = Integer.valueOf(num1);
//                int number2 = Integer.valueOf(num2);
//                int result = number1-number2;

                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                int result = num1-num2;

                output.setText(String.valueOf(result));
            }

        });

        add(input1);
        add(input2);
        add(jButton1);add(jButton2);
        add(output);
        setLayout(new FlowLayout(1));
        setTitle("Calculate");
        setVisible(true);
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {new SumSub();
    }
}
