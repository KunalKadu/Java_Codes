import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        int ans=sumOfDig(n);
        System.out.println(ans);
    }
    static int sumOfDig(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDig(n/10);
    }
}
