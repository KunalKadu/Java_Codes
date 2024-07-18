
// sum of n numbers
import java.util.Scanner;

public class Sum {
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

    /*we can use this loops also
       using for loop
       public static void sum(int n){
        int sum=0;
        for(int i=0; i<=n;i++){
            sum=sum+i;
        }
         System.out.println("The sum upto " + n + " is = " + sum);
       }     
       */
      /*
          Using do while loop
            public static void sum(int n){ 
           int i=1;
            int sum=0;
          do{
           sum=sum+i;
           i++;
          }while(i<=n);
           System.out.println("The sum upto " + n + " is = " + sum);
        }
       */       
}
