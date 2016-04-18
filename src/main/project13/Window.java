package main.project13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JFrame {
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton fibSeqButton;
    private JRadioButton factorialButton;
    private JTextField inputNumberTextField;
    private JPanel dialogJPanel;

    public static void main(String[] args) {
        Window window = new Window();
    }

    public Window() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setTitle("Fibonacci and Factorial");
        setResizable(false);

        JLabel descriptionField = new JLabel("<html>The program is designed to calculate the factorial" +
                "<br> or a Fibonacci sequence." +
                "<br>Enter the number for the calculation:</html>");


        fibSeqButton = new JRadioButton("Fibonacci Sequence", false);
        factorialButton = new JRadioButton("Factorial", true);
        group.add(fibSeqButton);
        group.add(factorialButton);
        inputNumberTextField = new JTextField();
        JButton findButton = new JButton("Calculate!");
        dialogJPanel = new JPanel();
        JPanel descriptionPanel = new JPanel();

        add(descriptionPanel);
        add(descriptionField,
                new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(10, 5, 5, 3), 0, 0));
        descriptionPanel.add(descriptionField);
        add(fibSeqButton,
                new GridBagConstraints(0, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 3), 0, 0));
        add(inputNumberTextField,
                new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(7, 5, 5, 3), 0, 0));
        add(factorialButton,
                new GridBagConstraints(0, 4, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(2, 5, 5, 3), 0, 0));
        add(findButton,
                new GridBagConstraints(0, 5, 1, 1, 0.0, 0.9, GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL, new Insets(12, 5, 5, 3), 0, 0));

        findButton.addActionListener(new findButtonActionListener());

        setVisible(true);
        pack();
    }

    public class findButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String inputData = inputNumberTextField.getText();
            String message, result;
            int enteredInteger;
            try {
                enteredInteger = Integer.parseInt(inputData);
                outputResult(enteredInteger);
            } catch (NumberFormatException nfe) {
                message = "Invalid input! \n For the calculation you must enter " +
                        "positive integer.";
                result = "Error";
                JOptionPane.showMessageDialog(dialogJPanel, message, result, JOptionPane
                        .DEFAULT_OPTION);
            } catch (NegativeIntegerException nie) {
                message = "It is not possible to calculate negative numbers to calculate " +
                        "You must enter a positive integer.";
                result = "Error";
                JOptionPane.showMessageDialog(dialogJPanel, message, result, JOptionPane
                        .DEFAULT_OPTION);

            } catch (UpperLimitException ule) {
                message = "Unable factorial calculation for the number of > 170 \n For " +
                        "calculation" +
                        " you must enter a positive integer from 1 to 170.";
                result = "Error";
                JOptionPane.showMessageDialog(dialogJPanel, message, result, JOptionPane
                        .DEFAULT_OPTION);

            }
        }

        private void outputResult(int number) throws NegativeIntegerException, UpperLimitException {

            if (fibSeqButton.isSelected()) {
                FibonacciSequence fibonacci = new FibonacciSequence();
                fibonacci.checkInteger(number);
                ArrayList<Integer> fibonacciSequence = fibonacci.getFibSeq(number);

                JOptionPane.showMessageDialog(dialogJPanel, "Fibonacci sequence: "
                        + fibonacciSequence, "Result", JOptionPane.DEFAULT_OPTION);
            }

            if (factorialButton.isSelected()) {
                Factorial factorial = new Factorial();
                factorial.checkInteger(number);
                JOptionPane.showMessageDialog(dialogJPanel, "Factorial: " + String.valueOf(factorial
                                .getFactorial(number))
                        , "Result", JOptionPane.DEFAULT_OPTION);
            }
        }
    }
}