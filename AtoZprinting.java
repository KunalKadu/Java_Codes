
public class AtoZprinting {
    public static void main(String[] args) {

        /* Basic approach
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.print(" "+ch);
        }
        */

        /* using  a series to store data */
        /*
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series= series+" "+ch;
        }
         System.out.print(series);

         This is also not good approach because at insertion of new item new string is created
         so there is wastage of memory
         e.g.  a, ab, abc,abcd,abcde,.....
         Time complexity is O(N^2)
         */
    }
}
