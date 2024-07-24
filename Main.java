package Inheritance.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.start();
        // c1.acc();
        // c1.stop();

        // Car CarMed=new Car();
        // CarMed.stop();// this will output I stop car engine like normal car 
        // but we want to stop media not engine 
        //to overcome this problem we create separate class that only implements media
        
        NiceCar car3=new NiceCar();
        car3.start();
        car3.startMusic();
        car3.stopMusic();
        car3.upgradeEngine(null);
        car3.start();
    }    
}
