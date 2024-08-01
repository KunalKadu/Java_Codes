package Stack_Queue;
//queue is interface      stack is class

import java.util.LinkedList;
import java.util.Queue;

public class Q_collection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //or Queue<Integer> queue = new Queue<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek()); /// return first item but does not delete it
        System.out.println((queue.remove()));
        System.out.println(queue.peek());
    }
    
}
