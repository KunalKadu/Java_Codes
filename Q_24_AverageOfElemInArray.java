// Q.24 Find the average of numbers in array

import java.util.Scanner;
public class Q_24_AverageOfElemInArray {
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
        System.out.println("Average is: "+AverageElem(arr));
}
public static float AverageElem(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum += arr[i];;
    }
    float avg=(float) sum/arr.length;
    return avg;
}
}
