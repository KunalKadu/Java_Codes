//410
import java.util.Scanner;
public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n "+splitArray(arr,arr.length-1));
    }
    public static int splitArray(int[] arr, int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end +=arr[i];
        }
        while(start<end){
            int mid= start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int num:arr){
                if(sum+num>mid){
                    //if greaer than  mid then cant add in array so crete diff part
                    sum=num;
                    pieces ++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}