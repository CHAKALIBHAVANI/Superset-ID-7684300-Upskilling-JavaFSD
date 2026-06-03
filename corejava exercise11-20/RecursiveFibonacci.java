import java.util.Scanner;

class RecursiveFibonacci 
{

    // Fibonacci method
    static int fibonacci(int n) {

        if(n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take position
        int n = sc.nextInt();

        System.out.println(fibonacci(n));

        sc.close();
    }
}