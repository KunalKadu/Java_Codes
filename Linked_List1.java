package Linked_List_Que;
/* Logic
  first of all remember that we need head and tail node so create then 
  then we need next node and value but should be in the Node class  
 */

public class Linked_List1 {
    public static void main(String[] args) {
        Linked_List1 list=new Linked_List1();
        list.insertfirst(2);
        list.insertfirst(5);        
        list.insertfirst(3);
        list.insertfirst(12);
        list.insertfirst(6);
        list.insertlast(79);
        list.insertlast(26);
        list.insert(43, 3);
        list.insert(10, 0);
        list.display(); // will print 6 12 3  5 2  end
        // System.out.println(list.deletefirst());
        // System.out.println(list.deletelast());
        System.out.println(list.delete(2));
        Node result = list.find(26);
if (result != null) {
    System.out.println("Node found: " + result.value);
} else {
    System.out.println("Node not found");
}

    }
    private Node head;
    private Node tail;
    private class Node{
        private int value;
        private Node next;
    

    //constructor 
    public Node(int value){
       this.value=value;
    }
    public Node(int value, Node next){
        this.value=value;
        this.next=next;
    }
    }
    private int size;
    public Linked_List1(){
        this.size=0;
    }
    
    public void insertfirst(int val){
        Node node=new Node(val); //creating new node
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size +=1;
    }
    public void display(){
        Node temp = head ;// as we cannot modify original data so we crete new temporary node
        while(temp!= null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    // public void insertlast(int val){
    //     if(tail==null){
    //         insertfirst(val);
    //         return;
    //     }
    //     Node node = new Node(val);
    //     tail.next=node;
    //     tail=node;
    //     size++;
    // }

    public void insertlast(int val) {
        if (tail == null) { // If the list is empty, update head
            insertfirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }
    
    //inserting at specific poition
    /*  here we will  first check index==0 if yes then insertfirst()
      if index==size then insertlast 
      otherwise crete temporary node and for i=0 to index 
      move temp to temp.next and make i++
      so that you will reach at desired index
      then at temp.next insert new node and size++
     */
    public void insert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail = null;
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
            Node secondlast=get(size);//in book given size-2 but it is not correct
            int val = tail.value;
            tail=secondlast;
            tail.next = null;
            return val;
        }
        //delete particular index   go to index-1
        public int delete(int index){
            if(index==0){
                return deletefirst();
            }
            if(index == size-1){
                return deletelast();
            }
            Node prev=get(index-1);
            int val=prev.next.value;//storing value of tail i.e. end

            prev.next = prev.next.next;//setting prev.next to null
            return val; // return deleeted value
        }

        // finding node
        public Node find(int value){
            Node node= head;
            while(node!= null){
                if(node.value == value){
                    return node;
                }
                node= node.next;
            }
            return null;
        }
    }


