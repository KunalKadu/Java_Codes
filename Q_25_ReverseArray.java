import java.util.Scanner;
import java.util.Arrays;
public class Q_25_ReverseArray {
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
        System.out.println("Given array is: "+Arrays.toString(arr));
        reverseArr(arr);
           System.out.println("Reversed Array is :"+Arrays.toString(arr) );
}
public static void reverseArr(int[] arr){
    // instead of for loop use while conditiopn end> start
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end --;
    }
}
}
