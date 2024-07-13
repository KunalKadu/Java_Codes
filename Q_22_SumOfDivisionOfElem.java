// Q22 create array of numbers multiples of 2 like 12,44,56 ...etc divide each element of array by 4
// Add all the ansers coming after division


import java.util.Scanner;
public class Q_22_SumOfDivisionOfElem {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of Array: ");
            int size=sc.nextInt();
            int[] arr=new int[size];
            System.out.println("Enter "+size+" elements in the array ");
            // taking input from user
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            } 
            System.out.println("The Sum of division is: "+sumElem(arr));
    }
    public static double sumElem(int[] arr){
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            double div=(double)arr[i]/4; // if we dont write (double) then it will save answer as int  div
            sum +=div;
        }
        return sum;
    }
}
