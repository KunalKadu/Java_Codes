import java.util.Arrays;
import java.util.Scanner;

public class selectionsortRecursion {
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
        selectionSort(arr, arr.length - 1, 0); // setting max to 0 initially
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int e, int s) {
        // max is the index where the greater element is present
        if (e <= 0) {
            return;
        }

        int maxIndex = s;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Swap the maximum element with the last element of the unsorted part
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[e];
        arr[e] = temp;

        // Recursively sort the remaining unsorted part
        selectionSort(arr, e - 1, s);
    }
}
