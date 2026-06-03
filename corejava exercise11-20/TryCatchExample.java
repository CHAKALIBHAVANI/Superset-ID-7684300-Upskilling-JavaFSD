import java.util.Scanner;

class TryCatchExample {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        try {

            // Take numbers
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);

        } 
        catch(ArithmeticException e) 
        {

            // Handle divide by zero
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}