    // Q19 create an array ,take input from user and check whether the element present in array or not


import java.util.Scanner;
import java.util.Arrays;
public class Q_19_ElementPresent {
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
        if(ElemPresent(arr,elem)){
            System.out.println("Yes , "+elem+" is present in array");
        }else{
            System.out.println("No, "+elem+" is NOT present in array");
        }
}
public static boolean ElemPresent(int[] arr, int n){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
            
            //System.out.println("Element present at "+i);// for printing index
            return true;
        }
    }
    return false;
}
}
