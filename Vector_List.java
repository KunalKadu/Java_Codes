package Collection;

import java.util.List;
import java.util.Vector;

public class Vector_List {
    public static void main(String[] args) {
        List<Integer> vect = new Vector<>();
        vect.add(45);
        vect.add(5);
        vect.add(15);
        System.out.println(vect);
        System.out.println(vect.get(1));
        System.out.println(vect.indexOf(15));
    }
}