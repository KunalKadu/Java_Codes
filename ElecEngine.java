package Inheritance.Interfaces;

public class ElecEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Electric Engine start");
    }
    @Override 
    public void stop(){
        System.out.println("Stop Electric Engine");
    }
    @Override
    public void acc(){
        System.out.println("Electric engine accelerate");
    }
}
