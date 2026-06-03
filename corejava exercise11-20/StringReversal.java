import java.util.Scanner;

class StringReversal 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Take string
        String text = sc.nextLine();

        // Reverse string
        String reversed =
                new StringBuilder(text).reverse().toString();

        System.out.println(reversed);

        sc.close();
    }
}