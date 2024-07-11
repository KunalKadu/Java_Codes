// Q 14 find fibonacci number upto n
// start 0 , 1,1,2,3,5,8,13     fibonacci number is sum of previous two numbers

import java.util.Scanner;
public class Q_14_FibonacciNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find fibonacci numbers");
        int n=sc.nextInt();
        System.out.println("Fibonacci Series upto index "+n +" is");
        fibonacciNo(n);
    }
    public static void fibonacciNo(int n){
        int count=3; // we are first printing first two fibonacci numbers
        int s=0;
        int t=1;
        System.out.println(s +"\n"+t );
        while(count<=n){
        int fib=s+t;
        s=t;
        t=fib;
        System.out.println(fib);
        
        count++;
        }
    }
}
