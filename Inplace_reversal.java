/* here tail is not given so take 3 pointers previous = null
 *  present = head and next
 * initially present.next = null or prev ;
 * then after first increment all 3;
 * then previous= present 
 * present = next 
 * next=next.next
 */

public class Inplace_reversal {
    public static void main(String[] args) {
        Inplace_reversal  l = new Inplace_reversal();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(6);
        l.insertLast(7);
        l.display();
        l.reversal();
        l.display();

    }
     private Node head;
        private Node tail;
    
        private class Node{
            private int value;
            private Node next;
    
            public Node(int value){
                this.value=value;
            }
            
        }
            private int size;
            public Inplace_reversal(){
                this.size=0;
            }
        //inserting at start i.e. head
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head=node;
            if(tail == null){
                tail=head;
            }
            size +=1;
        }
    
        //inserting at last
        public void insertLast(int val){
            if(tail==null){
                insertFirst(val);
            }
            Node node= new Node(val);
            tail.next=node;
            tail=node;
        }
    
        //insert at particular location
        public void insert(int val , int index){
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size){
                insertLast(val);
                return;
            }    
}
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.value+" -> ");
        temp=temp.next;
    }
    System.out.println("End");
}
    public void reversal(){
        if(size<2){
            return;
        }
        Node prev= null;
        Node present = head;
        Node next = present.next;

        while(present!= null){
            present.next=prev;
            prev=present;
            present = next;
            if(next!= null){
                next=next.next;
            }
        }
        head = prev;
    }
}
