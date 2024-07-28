public class palindrome_LL {
    public static void main(String[] args) {
    palindrome_LL l= new palindrome_LL();
        l.insertFirst(5);
        l.insertFirst(4);
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);   
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.display();
        System.out.println(l.isPalindrome(l.head));
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
            public palindrome_LL(){
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

public boolean isPalindrome(Node head){
    Node mid=middleNode(head);
    Node headsecond= reverseList(mid);
    Node reverseHead = headsecond;

    //compare back the halves
    while(head != null && headsecond != null){
        if(head.value != headsecond.value){
            break;
        }
        head = head.next;
        headsecond = headsecond.next;
    }
    reverseList(reverseHead);
    return head==null || headsecond == null;
}
public Node reverseList(Node head){
    if(head== null){
        return head;
    }
    Node prev = null;
    Node present = head;
    Node next = present.next;

    while(present!= null){
        present.next = prev;
        prev = present ;
        present = next;
        if(next != null){
            next = next.next;
        }
    }
    return prev;
}
public Node middleNode(Node head){
    Node s= head;
    Node f = head;
    while(f!= null && f.next != null){
        s=s.next;
        f=f.next.next;
    }
    return s;
}
}
