

public class Reverse_recursion {
    public static void main(String[] args) {
        Reverse_recursion  l = new Reverse_recursion();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(6);
        l.insertLast(7);
        l.display();
        l.reverse(l.head);
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
            public Reverse_recursion(){
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
private void reverse (Node node){
    if(node == tail){
        head=tail;
        return;
    }
    reverse(node.next);
    tail.next=node;
    tail=node;
    tail.next=null;
}
}