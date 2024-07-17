import java.util.ArrayList;
import java.util.Arrays;
public class StringBasics {
    public static void main(String[] args) {
        /* Using Arrays.tostring method for printing array */
        /*
        int[] arr=new int[]{2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
         */
        /*  Using Wrapper class
         System.out.println(56);

         Integer num= new Integer(56);
         System.out.println(num.toString());
         */
     // System.out.printf() |||used for formatted string, roundoff the number upto specified index
        
       //String strDouble =String.format("%,.2f",432.23241);
        /*
        float a= 1234.1234f;
        System.out.printf("%,.2f",a);
         */
      //  System.out.printf("Hello My name is %s, and I am an %s ", "Kunal","Engineer");
     //  each placeholder % is replaced by correct value ,    sequentially
  /*
     System.out.println('a'+'b');// make sun of their ASCII values
     System.out.println("a"+"b"); // concatenation 
     System.out.println('a'+3);  //97 +3
*/

// TYPECASTING 
//System.out.println((char)('a'+3));

//System.out.println("Kunal"+new Integer(56));

// + operator can be used to join complex object also but at least one should be string
System.out.println("Kunal "+ new ArrayList<>());


    }    
}
