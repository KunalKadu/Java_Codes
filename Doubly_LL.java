package Linked_List_Que;

public class Doubly_LL {
public static void main(String[] args) {
    Doubly_LL l=new Doubly_LL();
    l.insertfirst(5);
    l.insertfirst(2);
    l.insertfirst(1);

    l.insertlast(7);
    l.insertlast(8);

    l.insert(2,3);
    l.insert(3,4);
    l.insert(5, 6);
    l.display();
    // l.dis_Rev();
}

    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val=val;
        }
        // public Node(int val, Node next, Node prev){
        //     this.val=val;
        //     this.next=next;
        //     this.prev=prev;
        // }
    }
    private Node head;
    //insert at first
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head = node;
    }

    public void insertlast(int val){
        Node node=new Node(val);
        Node last= head;
        node.next=null;
        if(head==null){
            node.prev = null;
            head=node;
            return;
        }
        while(last.next!= null){
            last = last.next;
        }
        last.next=node;
        node.prev= last;
    }
    public Node find(int value){
        Node node = head;
        while(node!= null){
            if(node.val == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node= new Node(val);
        node.next=p.next;
        p.next= node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.println("End");
    }

    public void dis_Rev(){
        Node node= head;
        Node last =null;
        while(node!= null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.print("End \n");

        System.out.println("Print In Reversse Order");
        while(last!=null){
            System.out.print(last.val +" -> ");
            last= last.prev;
        }
        System.out.println("start");
    }
}
