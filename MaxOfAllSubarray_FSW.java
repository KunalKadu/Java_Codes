import java.util.ArrayList;
import java.util.List;

public class MaxOfAllSubarray_FSW {
    public static void main(String[] args) {
        int[] arr= {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(MaxOfAll(arr, k));
    }
    static List<Integer> MaxOfAll(int[] arr , int k){
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int i =0,j=0;
        // while(j<arr.length){
        //     if(j-i+1 <k){
        //         j++;
        //     }
        //     if(l.size()>0 && l.get(i)<arr[j]){
        //         l.remove(i);
        //         l.add(arr[j]);
        //     }
        //     if(j-i+1 ==k){
        //         ans.add(l.get(0));
        //         if(l.get(0)==arr[i]){
        //             l.remove(0);
        //         }
        //         i++;
        //         j++;
        //     }
            
        // }
        // return ans;

        while (j < k) {
            while (!l.isEmpty() && l.get(l.size() - 1) < arr[j]) {
                l.remove(l.size() - 1);
            }
            l.add(arr[j]);
            j++;
        }
        
        ans.add(l.get(0));
        
        // Slide the window and update maximum
        while (j < arr.length) {
            if (l.get(0) == arr[i]) {
                l.remove(0);
            }
            i++;
            while (!l.isEmpty() && l.get(l.size() - 1) < arr[j]) {
                l.remove(l.size() - 1);
            }
            l.add(arr[j]);
            ans.add(l.get(0));
            j++;
        }
        
        return ans;
    }
    
}
