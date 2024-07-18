//Q5
// sum of even numbers upto "n" numbers

import java.util.Scanner;
public class SumEvenNo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find sum: ");
        n = sc.nextInt();
        sum(n);
    }

     public static void sum(int n) {
        int i = 0; // also we can start from 1
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum upto " + n + " is = " + sum);
    }
}
