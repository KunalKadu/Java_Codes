import java.util.ArrayList;
import java.util.Scanner;

public class subSequence_ASCII {
    public static void main(String[] args) {
        char ch='a';
        System.out.println(ch+0); // print 97
        System.out.println((char)(ch+1));// print b as we are using type casting
        System.out.println("Enter any string to find its subsequence");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        //subSeqAscii("", str);
        System.out.println(subseqAscArr("", str));
    }
    static void subSeqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
       subSeqAscii(p+(ch+0), up.substring(1));
    }

    /* using arraylist */
    static ArrayList<String> subseqAscArr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> first= subseqAscArr(p+ch, up.substring(1));
        ArrayList<String> second= subseqAscArr(p, up.substring(1));
        ArrayList<String> third= subseqAscArr(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
