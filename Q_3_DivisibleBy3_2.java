// trying to print divisible by 3 or 5 or both

import java.util.Scanner;

public class Q_3_DivisibleBy3_2 {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    if(n % 3 ==0){
        if(n % 5==0){
        System.out.println("Number divisible by 3 and 5");
    }
    else{
        System.out.println("Number divisible by 3");
    }
    }else if (n % 5 == 0){
        System.out.println("Number divisible by 5");
    }
    else{
        System.out.println("Number is not divisible by 3 or 5");
    }
}
}
