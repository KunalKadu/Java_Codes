package Polymorphism;

public class circle extends shapes{
    // void area(){
    //     System.out.println("In circle");
    // }
    //trying runtime Polymorphism

    @Override void area(){
        System.out.println("Area is pie*r*r");
    }
}