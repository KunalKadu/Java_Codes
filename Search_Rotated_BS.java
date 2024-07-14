public class Search_Rotated_BS {
    public static void main(String[] args) {
        int a[]={50,60,70,80,90,10,20,30,40};
        int key = 60;
        System.out.println(findKey(a,a.length,key));
    }
    static int binarySearch(int a[], int start, int end, int key){
        if(end<start){
            return -1;
        }
        int mid =start +(end-start)/2;
        if(key== a[mid])
            return mid;
        if(key > a[mid])
            return binarySearch(a,mid+1,end,key);
        return binarySearch(a,start,mid-1,key);
    }

   public static int findPivot(int a[], int start, int end){
        if(end <start) return -1;

        int mid = start +(end-start)/2;

        if(mid<end && a[mid]>a[mid+1])
            return mid+1;
        if(mid>start && a[mid]<a[mid-1])
            return mid;
        if(a[mid] < a[start])
            return findPivot(a,start,mid-1);
        return findPivot(a, mid+1,end);
    }
    public static int findKey(int a[] , int n , int key){
        int pivot= findPivot(a,0,n-1);
        if(pivot == -1)
            binarySearch(a,0,n-1,key);
        if(a[pivot]==key)
            return pivot;
        if(a[0]<key)
            return binarySearch(a,0,pivot-1,key);
            return binarySearch(a,pivot-1,n-1,key);
    }
}
