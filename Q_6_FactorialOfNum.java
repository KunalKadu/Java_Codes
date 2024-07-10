// Q6 Factorial of given number

import java.util.Scanner;
public class Q_6_FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want to find factorial : ");
        int n=sc.nextInt();
        System.out.println("Factorial is: "+fact2(n));
    }
    /*   This function will  give factorial for number 31 as after that the range of integer
      get over. And the complexity is higher . so not efficient way
     
    public static void fact(int n){
        int factorial=1;
        while(n>=1){
          factorial=factorial * n;
          n--;
        }
        System.out.println("Factorial is "+ factorial);
    }
    */
    // this is via recursion this will also give factorial for limited size
    public static int fact2(int n){
        if(n<=1){
            return 1;
        }
        return n*fact2(n-1);// never write n-- in recursion it will give infinite recursion
    }
}
