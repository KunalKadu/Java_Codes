/*Input:   1 -> 2-> 3-> 4-> 5 -> 6 -> 7 
  Output:  1 -> 7-> 2-> 6-> 3->  5 -> 4

  take mid, compare, swap 
*/

import org.w3c.dom.Node;

public class Reorder_List {

    public static void main(String[] args) {
        Reorder_List l = new Reorder_List();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.display();
        l.reorderList(l.head);
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
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
        private int size;
        public Reorder_List(){
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
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);//first create constructor for two arguments
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    
    public void reorderList(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node mid = middleNode(head);
        Node hs=reverseList(mid);
        Node hf = head;

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf= temp;

            temp = hs.next;
            hs.next = hf;
            hs= temp;
        }

        if(hf != null){
            hf.next = null;
        }
    }
    public Node middleNode(Node head)    {
        Node s = head;
        Node f= head;
        while(f != null && f.next != null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    
private Node reverseList(Node head){
    if(head == null){
        return head;
    }
    Node prev = null;
    Node present = head;
    Node next=present.next;

    while(present != null){
        present.next = prev;
        prev = present;
        present = next;

        if(next != null){
            next = next.next;
        }
    }
    return prev;
}
}
