// Q 26 Binary search , this algorithm is having O(log n) time complexity
//First take input elements and target 
// in should be in sorted order (Ascending)
// find middle
// if target is less than mid then mark mid as end and search start to end (recursively)
// if target is greater than mid then mark mid as start and keep end as end and search recursively
// if mid== target then return mid

import java.util.Scanner;
public class Q_26_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to be searched");
        int target=sc.nextInt();
        int ans=binary_search(arr,target);
        System.out.println("Index is at which element "+target +" is present " +ans);
    }
    public static int binary_search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
             int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
                
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
