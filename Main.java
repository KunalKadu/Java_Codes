package Polymorphism;

public class Main {
    public static void main(String[] args) {
    //     shapes shape = new shapes();
    //     shape.area();
    //     shapes shape2 = new circle();
    //     shape2.area();
    //     triangle shape3 = new triangle();
    //     shape3.area();
    //     shapes shape4 = new square();
    //     shape4.area();
    // }
    circle c= new circle();
    c.area();
    System.out.println(c instanceof shapes);// if object belong to class which is parent or child then return true
    //(obj instance of subclass)    true
    //(obj instance of obj)   true
    //obj instance of parent    true
    System.out.println(c.getClass());//return package name and class name to which object belong

    System.out.println(c.getClass().getConstructors());//gives list of constructors

    System.out.println(c.getClass().getName()); //gives package.class name  
}
}