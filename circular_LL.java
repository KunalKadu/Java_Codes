//same as that of singly linked list , only attach tail to head
package Linked_List_Que;

public class circular_LL {
    public static void main(String[] args) {
        circular_LL l= new circular_LL();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        l.delete(4);
        l.display();
        l.RecursiveInsert(88, 2);
        l.display();

    }

    private class Node{
        int val ;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val2, Node node) {
        }
    }
    private Node  head;
    private Node tail;

    public circular_LL(){
        this.head = null;
        this.tail=null;
    }
    public void insert (int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    //agar head null hai toh node ko head me dalo,tail ko head pe rakho 
    //else node last ke aage add karenge isliye tail ke next me node ko dalo 
    //node ke next me head ko dalo and  tail ko node pe point karo(so that tail poinitng
    //towards end)
    
    //when size/tail is not given   insert using recursion 

    public void RecursiveInsert(int val, int index){
        head=RecursiveInsert(val, index,head);
    }
    private Node RecursiveInsert(int val ,int index , Node node){
        if(index==0){
            Node temp=new Node(val,node);
            // size++;
            return temp;
        }
        node.next=RecursiveInsert(val, index--, node.next);
        return node;
    }

    public void delete(int val){
        Node node= head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n= node.next;
            if(n.val == val){
                node.next =n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node node=head;
        if(head != null){
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            }while(node!=head);
        }
        System.out.print("Start \n");
    }
}
