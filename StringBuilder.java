import java.util.*;
public class MyStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch); // at at the last of series need not to create new variable each time
        }
        System.out.print(builder.toString());
    }
}
