// Q 10 tak ea character and check whether it is vowel or not

import java.util.Scanner;

public class Q_10_VowelCheck {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println(" Enter any alphabet :");
    // char c=sc.next(); this cannot work as next() is not a special input for char  it inputs string
    String str=sc.next();
    char c=str.charAt(0);
    vowelCheck(c);
  }  
  public static void vowelCheck(char c){
    if(c =='a' || c=='A'  || c =='e' || c=='E' || c =='i' || c=='I' || c =='o' || c=='O' || c =='u' || c=='U'){
        System.out.println("Yes the given character "+c+ " is vowel");
    }else{
        System.out.println("No the given character is NOT a vowel");
    }
  }

/*  other way
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println(" Enter any alphabet :");
    // char c=sc.next(); this cannot work as next() is not a special input for char  it inputs string
    String str=sc.next();
    char c=str.charAt(0);
    vowelCheck(c);
  } 
  public static void vowelCheck(char c){
    c=Character.toLowerCase(c);
    if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
        System.out.println("Yes the given character "+c+ " is vowel");
    }else{
        System.out.println("No the given character is NOT a vowel");
    }
  }
  */
  }
