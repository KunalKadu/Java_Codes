// Q16 create an array , take input from user and display it using  two methods 
//i.e. using iterative for loop and Arrays.toString() method

import java.util.Scanner;
import java.util.Arrays;
public class Q_16_ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements in the array ");
        // taking input from user
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // displaying using for loop
        System.out.println("The elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // display using Arrays.toString  this will print array in formatted form
       System.out.println(Arrays.toString(arr));
    }
}
