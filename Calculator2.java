
import java.util.Scanner;

public class Calculator2 {
    int numberOne, numberTwo;

    Calculator2() {
        numberOne = 17;
        numberTwo = 5;
    }

    /*
     * void init(int n1, int n2) {
     * numberOne = n1;
     * numberTwo = n2;
     * }
     */
    void add() {
        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
    }

    void subtract() {
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
    }

    void multiply() {
        System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
    }

    void division() {
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
    }

    // The main() method is executed by the JVM
    public static void main(String[] args) {
        Calculator2 calc1 = new Calculator2();
        // calc1.numberOne = 12;
        // calc1.numberTwo = 9;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter two integers: ");
        // take input from the user
        // int number1 = input.nextInt();
        // int number2 = input.nextInt();

        // calc1.init(30, 15);
        // calc1.init(number1, number2); 

        calc1.add();
        calc1.subtract();
        calc1.multiply();
        calc1.division();
        // closing the scanner object
        input.close();
    }
}
