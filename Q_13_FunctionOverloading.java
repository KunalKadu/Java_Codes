// Q13 Function overloading Create sum function and overload it for different number of arguments or datatype

public class Q_13_FunctionOverloading {
    public static void main(String[] args) {
        sum(6,11);  
       
    }
     static int sum(int a , int b){
        System.out.println("This is first function\n"+(a+b) );
        return a+b;
    }
     static int sum(int a, int b, int c){
        System.out.println("This is second function\n"+(a+b+c));
        return a+b+c;
    }
     static double sum(double a, double b){
        System.out.println("This is third function\n"+ (a+b));
        return a+b;
    }
}
