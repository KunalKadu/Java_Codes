// Q9 um of digits of a number e.g. 123   === 1+2+3

import java.util.Scanner;
public class Q_9_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sumOfDigit(n);
    }
    public static void sumOfDigit(int n){
        int num=n; // for simplification
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n /=10;  // n=n/10;
        }
        System.out.println("The sum of digits of number "+num+" is = "+sum);
    }
}
