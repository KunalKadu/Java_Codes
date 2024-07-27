package Linked_List_Que;

public class Merge_sortedLL {
    public static void main(String[] args) {
        Merge_sortedLL list_1= new Merge_sortedLL();
        Merge_sortedLL list_2= new Merge_sortedLL();
        list_1.insertLast(1);
        list_1.insertLast(3);
        list_1.insertLast(5);
        
        list_2.insertLast(1);
        list_2.insertLast(2);
        list_2.insertLast(9);
        list_2.insertLast(24);

        Merge_sortedLL ans= MergeLists(list_1,list_2);
        ans.display();

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
        public Merge_sortedLL(){
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static Merge_sortedLL MergeLists(Merge_sortedLL first , Merge_sortedLL second){
        Node f= first.head;
        Node s= second.head;

        Merge_sortedLL ans = new Merge_sortedLL();
        
    while (f != null && s != null) {
        if (f.value <= s.value) {
            ans.insertLast(f.value);
            f = f.next;
        } else {
            ans.insertLast(s.value);
            s = s.next;
        }
    }
    // If any list still has remaining elements, append them to the merged list
    while (f != null) {
        ans.insertLast(f.value);
        f = f.next;
    }
    while (s != null) {
        ans.insertLast(s.value);
        s = s.next;
    }
    return ans;

    }
}
