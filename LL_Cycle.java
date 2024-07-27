package Linked_List_Que;
//fast and slow pointer method
/* in this , with every iteration slow pointer increment by 1 and fast pointer increment by 2
 * If this two nodes present at one point then cycle is present
 */
public class LL_Cycle {
    public static void main(String[] args) {
        LL_Cycle l=new LL_Cycle();
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(6);
        l.insertLast(7);
        l.insertLast(4);
        l.display();
        System.out.println(l.hasCycle(l.head));

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
        public LL_Cycle(){
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
    public void insertLast(int val) {
        if (tail == null) { // If the list is empty, update head
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
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

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;
        }
        public int deletelast(){
            if(size<=1){
                return deletefirst();
            }
            Node secondlast=get(size);
            int val = tail.value;
            tail=secondlast;
            tail.next = null;
            return val;
        }

        public int delete(int index){
            if(index==0){
                return deletefirst();
            }
            if(index== size-1){
                return deletelast();
            }
            Node prev = get(index-1);
            int val=prev.next.value;

            prev.next=prev.next.next;
            return val;
        }

    //display list
    public void display(){
        Node temp = head ;// as we cannot modify original data so we crete new temporary node
        while(temp!= null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;
    
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) { // If the fast and slow pointers meet, it indicates a cycle
                return true;
            }
        }
        // If the loop terminates without finding a cycle, return false
        return false;
    }
}
