/* here we are going to find the prime number but going to use more edge cases so that it became more fast
   1.  find first prime number and eliminate other no.s mulitple of 2
   2. Find 2nd prime number and eliminate other no. multiple of that prime no.
 */
public class seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];
        seive(n,primes);
    }
    // false in array means no. is prime
    static void seive(int n, boolean[] arr){
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i+2;j<=n;j++){
                    arr[j]=true;// not prime
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
                System.out.println(i+" ");
            }
        }
    }

}
