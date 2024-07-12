// Q20 Check whether the elementis present in the array if yes then return the index of that element 

import java.util.Scanner;
import java.util.Arrays;
public class Q_20_ReturnIndexOfElem {
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
         System.out.println("Enter the element to check whether present or not :");
        int elem=sc.nextInt();
        System.out.println("Given array is "+Arrays.toString(arr));
        if(!ElemPresent(arr,elem)){
            System.out.println("No, "+elem+" is NOT present in array");
        }
}
public static boolean ElemPresent(int[] arr, int n){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
            // only adding this statement in previous code 
            System.out.println("The Element present at index "+i);// for printing index
           return true;
        }
    }
    return false;
}
}
