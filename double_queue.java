package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

// also called as deque
public class double_queue {
    public static void main(String[] args) {
        Deque deque= new ArrayDeque<>(); //helps o create obj. of method mentioned in deque interface
        //no restriction on capacity 
        // use in trees in BFS and DFS

        deque.add(89);
        deque.add(78);
        deque.addLast(87);
        System.out.println(deque.removeFirst());

    }
}
