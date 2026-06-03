// Number Guessing Game
import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Generate random number
        int secret = new Random().nextInt(100)+1;
        int guess=0;
        //Guess until correct
        while(guess != secret){
            guess=sc.nextInt();
            if(guess > secret)System.out.println("Too High");
            else if(guess < secret)System.out.println("Too Low");
            else System.out.println("Correct");
        }
        sc.close();
    }
}