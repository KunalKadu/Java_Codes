package Stack_Queue;

import java.util.Arrays;

//Que from Hacker rank (GAme of stacks)
//2 stacks are given. Nick can move 1 item from either of one stack . Nick will get disqualified
// if running sum> maxSum Return max no. pf moves Nick can make
public class MaxMoves_forMAxSUm {
    static int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x, a, b, 0 , 0) -1;
        // this is our ans it return the move at which sum exceed maxSum hence we do -1
    }
    private static int twoStacks(int x , int[] a, int[] b, int sum , int count){
        if(sum> x){
            return count;
        }
        if(a.length ==0 || b.length==0){
            return count;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length),b,sum+a[0], count+1);
        int ans2 = twoStacks(x, a,Arrays.copyOfRange(b, 1, b.length),sum+a[0], count+1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        int[] a={4,2,4,6,1};
        int[] b ={ 2,1,8,5};
        int maxSum= 10;
        System.out.println(twoStacks(maxSum, a, b));

    }
}
