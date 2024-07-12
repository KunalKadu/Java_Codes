// Q17 find the maximum element in the array

import java.util.Scanner;
import java.util.Arrays;
public class Q_17_MaxElemInArray {
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
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element from given array is "+MaxElement(arr));
    }
    public static int MaxElement(int[] arr){
        int max=arr[0];
        for(int i=1; i< arr.length-1; i++){
            while(i<arr.length){
          if(max<arr[i]){
            max=arr[i];
            i++;
          }else{
            i++;
          }
        }
        }
        return max;
    }
}
