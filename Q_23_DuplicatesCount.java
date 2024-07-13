// create array of numbers with some duplicates ,
// give any target element and find how much duplicates are present 

import java.util.Scanner;
public class Q_23_DuplicatesCount {
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
        System.out.println("Enter the element to find duplicate in the array ");
        int target=sc.nextInt();
        System.out.println("The number of duplicates of "+target+" is "+count_duplicates(arr, target));
}
public static int count_duplicates(int[] arr, int target){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
             count++;
             /* for returning index */
             //System.out.print(i +" ");
        }
    }

    return count;
}
}
