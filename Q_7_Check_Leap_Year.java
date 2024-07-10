// Q7 Check whether given number is Leap year or not
// leap years arrives once in 4 years
// the idea behind leap year is that if the given year is " divisible by 4 " then it is a leap year
import java.util.Scanner;
public class Q_7_Check_Leap_Year {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the year which you want to check whether it is Leap year or not");
    int year=sc.nextInt();
    leap_year(year);
    }
    public static void leap_year(int year){
        if(year%4 ==0){
            System.out.println("Yes, the given year "+ year+" is leap year");
        }else{
             System.out.println("No, the given year "+ year+" is not a leap year");
        }
    }
}
