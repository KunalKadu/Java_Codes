package Collection;
/*
   vetor :  They are synchronized
            only one thread accessed at a time if thread t1 is accessinig then t2 must wait
   ArrayList : It is not synchronized
               Multiple threads access at one time

    vector is slower than arraylist due to synchronization
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Array_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list.add(89);
        System.out.println(list);
        System.out.println(list2);
        list2.set(0, 23);
        System.out.println(list2);

        //getting element present at given index
        System.out.println(list2.get(2));
    }
}
