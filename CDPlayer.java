package Inheritance.Interfaces;

public class CDPlayer extends Media {
    @Override
    public void start(){
        System.out.println("Music start");
    }
    @Override 
    public void stop(){
        System.out.println("Stop music");
    }
}
