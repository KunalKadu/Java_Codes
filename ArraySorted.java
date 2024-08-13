import java.util.Scanner;
public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr,index+1);
    }
}
