import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input numbers and operator
        double num1 = input.nextDouble(); // first number
        char operator = input.next().charAt(0); // +, -, *, /
        double num2 = input.nextDouble(); // second number

        // Perform calculation
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            // safe division check
            System.out.println(num2 != 0 ? num1 / num2 : "Error: Divide by zero");
        }

        input.close(); // close scanner
    }
}