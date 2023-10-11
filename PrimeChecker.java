
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class PrimeChecker extends JFrame {
    PrimeChecker() {
        JTextField numTxt = new JTextField(10);
        JButton primeBtn = new JButton("Check prime");
        JButton factorialBtn = new JButton("Calculate Factorial");
        JLabel resultLabel = new JLabel("");
        numTxt.setColumns(20);

        primeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = numTxt.getText();
                int num = Integer.parseInt(text);
                if (checkPrime(num)) {
                    resultLabel.setText(num + " is a prime number");
                } else {
                    resultLabel.setText(num + " is not a prime number");
                }
            }
        });

        factorialBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = numTxt.getText();
                int num = Integer.parseInt(text);
                long factorial = calculateFactorial(num);
                resultLabel.setText("Factorial of " + num + " is " + factorial);
            }
        });

        add(numTxt);
        add(primeBtn);
        add(factorialBtn);
        add(resultLabel);
        setLayout(new FlowLayout());
        setTitle("Prime number checker");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    long calculateFactorial(int num) {
        if (num < 0) {
            return -1; // Invalid input, factorial of negative numbers is undefined
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        new PrimeChecker();
    }
}
