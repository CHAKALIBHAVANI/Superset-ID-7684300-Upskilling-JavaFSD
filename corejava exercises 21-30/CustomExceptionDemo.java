import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {

        Scanner scannerInput = new Scanner(System.in);

        try {
            int userAge = scannerInput.nextInt();

            if (userAge < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Valid age");

        } catch (InvalidAgeException error) {
            System.out.println(error.getMessage());
        } finally {
            // Always closes scanner safely
            scannerInput.close();
        }
    }
}