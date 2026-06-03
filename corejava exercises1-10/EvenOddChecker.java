import java.util.Scanner;

class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number
        int n = sc.nextInt();

        // Check even or odd
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}