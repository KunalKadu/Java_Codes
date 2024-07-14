/*  here pivot reference point is used
    all the elements < p will be on LHS of the pivot
    and element  > p will be at RHS of pivot
    put pivot at correct position
    at each step compare start with p and end with p
    if any one is small then put it at left else put it at right 
    then start++ and end--

    worst case O(N ^ 2)
    best case O(N log N)
 */



import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in the array ");
        // taking input from user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int s= low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot = nums[m];
        while(s<=e){
            //this while loop condion becoz if already sorted then need not to sort
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp= nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now pivot is at correct index so sort remaining left and right part
        quick(nums, low, e);
        quick(nums, s, high);
    }
}
