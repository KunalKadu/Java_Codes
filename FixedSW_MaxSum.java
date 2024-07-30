public class FixedSW_MaxSum{
    public static void main(String[] args) {
        int k =3; //windows size
        int[] arr= {2,5,1,8,2,9,1};
        System.out.println(find_maxSum(k, arr));
    }
    public static int find_maxSum(int k , int[] arr){
        int sum =0;
        int i=0,j=0;
        int mx =0;
        while(j<arr.length){
            sum += arr[j];
            if(j-i+1 <k){
                j++;
            }else if(j-i+1 ==k){
                mx= Math.max(mx, sum);
                sum= sum- arr[i];
            i++;
            j++;
            }
            
        }
        return mx;
}
}