public class StaticTry {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public StaticTry(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married = married;

        this.population +=1;
    }
}
