import javax.swing.JOptionPane;

public class CalculatorBasic {
    public static void main(String[] args) {
        String operation = JOptionPane.showInputDialog("Enter operation type (+, -, *, /):");
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            String firstNumber = JOptionPane.showInputDialog("Enter first number:");
            String secondNumber = JOptionPane.showInputDialog("Enter second number:");

            try {
                double a = Double.parseDouble(firstNumber);
                double b = Double.parseDouble(secondNumber);
                double result = 0;

                switch (operation) {
                    case "+":
                        result = addNumbers(a, b);
                        break;
                    case "-":
                        result = subtractNumbers(a, b);
                        break;
                    case "*":
                        result = multiplyNumbers(a, b);
                        break;
                    case "/":
                        result = divideNumbers(a, b);
                        break;
                }

                JOptionPane.showMessageDialog(null, "Result is: " + result);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation. Please enter one of +, -, *, /.");
        }
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static double subtractNumbers(double a, double b) {
        return a - b;
    }

    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public static double divideNumbers(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero.");
            return Double.NaN;
        }
    }
}
