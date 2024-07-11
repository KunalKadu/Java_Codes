// Q12 Create and greet function and greet user with his name 

import java.util.Scanner;
public class Q_12_FunctionGreeet {
    public static void main(String[] args) {
        inputName();
    }
    public static void Greet(String str){
        System.out.println("Hello "+ str+" !!!! \nWelcome do DSA group. \nPractice daily for more logic building");
    }
    public static void inputName(){
        Scanner sc =new Scanner(System.in);
        String name;
        System.out.println("Please enter your name :");
        name = sc.next();
        Greet(name);        
    }
}
