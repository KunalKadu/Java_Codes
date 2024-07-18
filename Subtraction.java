// sub of n numbers
// answer will be same as sum but sign is minus . 
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find subtraction: ");
        n = sc.nextInt();
        sub(n);
    }

     public static void sub(int n) {
        int i = 0;
        int sub = 0;
        while (i <= n) {
            sub = sub - i;
            i++;
        }
        System.out.println("The sum upto " + n + " is = " + sub);
    }
}