import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subseq("","abc");//this is not efficient as for each sub sequence new 
        //onject is created
        System.out.println(subseqkRet("","abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch= up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // to make it efficient we will use array-list
    static ArrayList<String> subseqkRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left= subseqkRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqkRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
