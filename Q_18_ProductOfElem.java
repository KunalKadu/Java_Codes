// Q18 create an array ,take input from user and find the product of elements of arrays

import java.util.Scanner;
import java.util.Arrays;
public class Q_18_ProductOfElem{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements in the array ");
        // taking input from user
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is "+Arrays.toString(arr));
        productOfElem(arr);
    }
    public static void productOfElem(int [] arr){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod=prod*arr[i];
        }
        System.out.println("The product of elements of array is : "+prod);
    }
}
