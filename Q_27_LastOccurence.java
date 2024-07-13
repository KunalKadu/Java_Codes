// Q 27 find the last occurence of the target element 

import java.util.Scanner;

public class Q_27_LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element to be searched");
        int target = sc.nextInt();
        int[] result = searchRange(arr, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = Last_occur(arr, target, true);
        int end = Last_occur(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int Last_occur(int[] arr, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}