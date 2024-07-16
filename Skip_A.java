import java.util.Scanner;

public class Skip_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string in small letters");
        String str=sc.next();
        skip("",str);//returning nothing
       System.out.println(skip2(str));//returning string
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }else{
            return ch+skip2(up.substring(1));
        }
    }
}
