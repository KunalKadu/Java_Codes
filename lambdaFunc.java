package Generics.Lambda_function;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)-> System.out.println(item*2));

        //or
        // Consumer<Integer> fun=(item)->System.out.println(item*2);
        // arr.forEach(fun);

        //if we want with multiple parameters then create interface 
    }
    int sum(int a, int b){
        return a+b;
    }
}
