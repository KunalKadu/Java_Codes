import java.util.Scanner;
public class Q_4_GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        float num1= sc.nextFloat();
        System.out.println("Enter Second number");
        float num2= sc.nextFloat();
        System.out.println("Enter Third number");
        float num3= sc.nextFloat();
        Greater(num1, num2 , num3);
    }
    public static void Greater(float num1, float num2 , float num3){
     if(num1 >num2 && num1 > num3){
        System.out.println("First number " + num1 + " is greater");
     }else if(num2 >num1 && num2 > num3){
        System.out.println("Second number "+ num2 + " is greater");
     } else{
        System.out.println("Third number"+ num3 + " is greater");
     }
    }
}
