import java.util.Scanner;

class PalindromeChecker 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Take string
        String text = sc.nextLine().toLowerCase();

        String reversed = new StringBuilder(text).reverse().toString();

        // Check palindrome
        if(text.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}