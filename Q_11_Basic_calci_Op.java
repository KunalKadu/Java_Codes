// Q11 basic operation of calculator using switch statement

import java.util.Scanner;
public class Q_11_Basic_calci_Op {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number ");
    long num1=sc.nextLong();
    System.out.println("Enter second number ");
    long num2=sc.nextLong();
    System.out.println("Which opertion do you want to perform \n Enter 1 for addition \n Enter 2 for Subtraction \n Enter 3 for multiplication \n Enter 4 for division ");
    int op=sc.nextInt();
    long result;
    switch (op) {
        case 1:
            result=num1 +num2;
            System.out.println("The addition is "+result);
            break;
        case 2:
            result=num1 - num2;
            System.out.println("The subtraction is "+result);
            break;
        case 3:
            result=num1 * num2;
            System.out.println("The multiplication is "+result);
            break;
        case 4:
            result=num1 / num2;
            System.out.println("The division is "+result);
            break;
    
        default:
            System.out.println("Enter valid detail");
            break;
    }
    }
}
