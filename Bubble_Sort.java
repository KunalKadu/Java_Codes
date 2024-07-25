package Linked_List_Que;

public class Bubble_Sort {
    public static void main(String[] args) {
        Bubble_Sort l = new Bubble_Sort();
        for(int i=7;i>0;i--){
            l.insertlast(i);
        }
        l.display();
        l.bubbleSort();
        l.display();
    }


    private Node head;
    private Node tail;
    private class Node{
        private int value;
        private Node next;
    

    //constructor 
    public Node() {
        this.value = 0; 
        this.next = null; 
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    }
    private int size;
    public Bubble_Sort(){
        this.size=0;
    }
    
    public void insertfirst(int val){
        Node node=new Node(val); 
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size +=1;
    }
    public void display(){
        Node temp = head ;
        while(temp!= null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println("END");
    }
   

    public void insertlast(int val) {
        if (tail == null) { 
            insertfirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }
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

    // public  void bubbleSort(){
    //     int col = 1;
    //     int row =0;
    //     if(row == 0){
    //         return ;
    //     }
    //     if(col < row){
    //         Node first = get(col);
    //         Node second = get(col+1);

    //         if(first.value > second.value){
    //             if(first == head){
    //                 head = second;
    //                 first.next = second.next;
    //                 second.next = first;
    //             }else if(second == tail){
    //                 Node prev = get(col-1);
    //                 prev.next = second;
    //                 tail = first;
    //                 first.next = null;
    //                 second.next = tail;
    //             }else{
    //                 Node prev = get(col-1);
    //                 prev.next = second;
    //                 first.next = second.next;
    //                 second.next = first;
    //             }
    //         }

    //     }
    // }

    public void bubbleSort() {
        Node current = head;
        Node index = null;
        int temp;
    
        if (head == null) {
            return; // Empty list, nothing to sort
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    

    // public void bubbleSort() {
    //     for (Node i = head; i != null; i = i.next) {
    //         for (Node j = head; j != null && j.next != null; j = j.next) {
    //             if (j.value > j.next.value) {
    //                 int temp = j.value;
    //                 j.value = j.next.value;
    //                 j.next.value = temp;
    //             }
    //         }
    //     }
    // }
    

    public Node get(int index){
        Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;
        }
}
