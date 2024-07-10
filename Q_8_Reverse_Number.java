// Q8 reverse the given number  eg. 123 then reverse is 321

import java.util.Scanner;
public class Q_8_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int ans= reverse_num(n);
        
        System.out.println("Entered number is "+n+"\n And the reversed number is "+ans);
    }
    public static int reverse_num(int n){ // it will remove zero if it is in front
        int rev=0;
        while(n!=0){
        int rem=n%10;
        
        rev=rev*10+rem;
        n=n/10;
        }
        return rev;
    }
}
