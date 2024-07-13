// Q21 create array of string and find the target element

import java.util.Scanner;

public class Q_21_StringArray {
            public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of Array: ");
            int size=sc.nextInt();
            String[] arr=new String[size];
            System.out.println("Enter "+size+" elements in the array ");
            // taking input from user
            for(int i=0;i<size;i++){
                arr[i]=sc.next();
            } 
            System.out.println("Enter the element to check whether present or not :");
        String name=sc.next();
        if(stringPresent(arr,name)){
            System.out.println("Yes , "+name+" is present in array");
        }else{
            System.out.println("No, "+name+" is NOT present in array");
        }
        }
        public static boolean stringPresent(String[] arr, String name){
            
            for(int i=0;i<arr.length;i++){
                // in case of strings == not work so use .equals() method
                if(arr[i].equals(name)){
                    System.out.println("Element is present at "+i);
                    return true;
                }
                
            }
            return false;
        }
        }
