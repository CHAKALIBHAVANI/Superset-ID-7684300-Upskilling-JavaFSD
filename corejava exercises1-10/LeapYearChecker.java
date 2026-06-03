//LeapYearChecker
import java.util.Scanner;
class LeapYearChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take year
        int year=sc.nextInt();
        //Check leap year
        if((year % 4==0 && year % 100 !=0)|| year % 400 == 0)
        System.out.println("Leap Year");
        else
        System.out.println("Not Leap Year");
        sc.close();
    }
}