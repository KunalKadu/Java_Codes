package Collection;
public class Enum_class {
    enum week{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday ;

        week(){
            System.out.println("constructor called for "+this);
        }
    }
    /*
       These are enum constants .  by default public, static & final , since it
       is final you cant create child enums
       type is week
     */
    public static void main(String[] args) {
        week w = week.Monday;
        for(week day : week.values()){
            System.out.println(day);
        }
        System.out.println("\n"+w);
        System.out.println("\n"+w.ordinal());//gives index of monday
    }
}
