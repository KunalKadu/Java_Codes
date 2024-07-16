// 645 here we return thr missing number and the number which is duplicated

import java.util.Scanner;
public class SetMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in the array ");

        // Taking input from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result= findErrorNums(arr);
        System.out.println("The duplicated item is "+result[0]);
        System.out.println("The required item is "+result[1]);
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
    
        return new int[]{-1, -1};
    }
    
    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    
}
