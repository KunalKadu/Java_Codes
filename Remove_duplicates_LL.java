package Linked_List_Que;

public class Remove_duplicates_LL {

    public static void main(String[] args) {
        Remove_duplicates_LL l= new Remove_duplicates_LL();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(3);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(6);
        l.insertLast(7);
        l.display();
        l.duplicates();
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
        public Remove_duplicates_LL(){
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public void duplicates(){
        Node node= head;
        while(node.next !=null ){
            if(node.value == node.next.value){
                node.next=node.next.next;
                size --;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next= null;
    }
}
