/* It is a number defined by following process .
 * 1. Starting with positive integer, replace the number by sum of squares of its digits 
 * 2. Repeat the process until the number equals 1(where it will stay ), or it loops
 * endlessly in cycle which does not include 1
 * e.g n=19   1^2 + 9^2 = 82    8^2 + 2^2 = 68    6^2 + 8^2 = 100 1^2=1 yes happy number
 */
package Linked_List_Que;

import java.util.Scanner;

public class happy_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n){
    int slow = n;
    int fast = n;
    do{
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast));
    }while(slow!= fast);
    if(slow ==1){
        return true;
    }
    return false;
}
private static int findSquare(int number){
    int ans =0;
    while(number>0){
        int rem = number% 10;
        ans += rem * rem;
        number /= 10;
    }
    return ans;
}
}