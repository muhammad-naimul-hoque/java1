
import java.util.Scanner;

// Driver class
public class Calculator {
    // main function
    public static void main(String[] args) {
        // Stores two numbers
        double num1, num2;

        // Take input from the user
        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        // Take the inputss
        num1 = inputs.nextDouble();
        num2 = inputs.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = inputs.next().charAt(0);
        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            result = num1 / num2;
        } else {
            System.out.println("You enter wrong inputs");
            System.exit(0);
        }

        System.out.println("The final result:");

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + result);
    }
}
