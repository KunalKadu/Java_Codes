import java.util.Scanner;
public class RotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the Elements of Bitonic Array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("It requires "+countRotation(arr)+" rotation");
    }
    public static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot +1;
    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
