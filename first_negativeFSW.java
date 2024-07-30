import java.util.ArrayList;
import java.util.List;

public class first_negativeFSW {
    public static void main(String[] args) {
        int[] arr = { 12,-1,-7,8,-15,30,16,28};
        int k =3;
        System.out.println(firstNegative(arr, k));
    }
    public static List<Integer> firstNegative(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        int i =0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                negatives.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                if(negatives.size()==0){
                    result.add(0);
                }else{
                    result.add(negatives.get(0));
                }
            
            if(arr[i]<0){
                negatives.remove(0);
            }
            i++;
            j++;
        }
    }
        return result;
    }
}
