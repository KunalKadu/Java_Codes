/*
    Select an element as output it at its correct index
    Time complexity Best and worst  O(n^2)
    Not stable algorithm
    steps:
    find max element place it at end
    i.e. run loop n-1 times and at each time max element is placed at the end

 */
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
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
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));    
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex= getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    private static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for(int i=start; i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

}
