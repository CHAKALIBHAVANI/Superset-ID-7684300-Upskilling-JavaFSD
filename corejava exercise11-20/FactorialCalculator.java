import java.util.Scanner;

class FactorialCalculator 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Take number
        int n = sc.nextInt();

        long fact = 1;

        // Calculate factorial
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);

        sc.close();
    }
}