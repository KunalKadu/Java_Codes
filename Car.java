package Inheritance.Interfaces;
//car with engine an dbreak functionality
public class Car implements Engine , Break {
    @Override
    public void break1(){
        System.out.println("I brake like normal car");
    }
    @Override
        public void start(){
            System.out.println("I start like normal car Engine");
        }
    @Override
        public void stop(){
            System.out.println("I stop like normal car Engine");
        }
        @Override
            public void acc(){
                System.out.println("I accelerate like normal car");
            }
}
