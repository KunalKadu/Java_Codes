// Q15 Check whether the given string is pallindrome or not
// "12321"  this is pallindrome because if we reat it from start or end it appears same
 

import java.util.Scanner;
public class Q_15_PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether it is pallindrome or not");
        String str=sc.next();
        if(pallindrome(str)){
            System.out.println("Yes, the entered string is pallindrome");
        }else{
            System.out.println("No, the given string is not pallindrome");
        }
    }
    /* NOT working for all strings 
    public static boolean pallindrome(String str){
        for (int i=0; i<str.length()/2;i++){
            for(int j=str.length()-1;j>=i;j--){
                if(str.charAt(i)==str.charAt(j)){
                  i++;
                  j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    */
    public static boolean pallindrome(String str){
        str=str.toLowerCase();
        char start=str.charAt(0);
        int j=str.length()-1;
        if(str==null || str.length()==0){
            return true;
        }
        for(int i=0;i<str.length()/2;i++){
            if(start== str.charAt(j)){
                start++;
                j--;
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
