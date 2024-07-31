package Stack_Queue;

public class circular_queue {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    protected int end =0;
    protected int front =0;
    private int size=0;
    
    public circular_queue(){
        this(DEFAULT_SIZE);
    }
    public circular_queue(int size){
        this.data= new int[size];
    }
    public boolean isFull(){
        return size== data.length;
    }
    

    public boolean isEmpty(){
       return size ==0;
    }
    public boolean insert(int item ){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
             throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front %data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
             throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i= front;
        do {
            System.out.print(data[i]+" -> ");
            i++;
            i%= data.length;
        } while (i!=end);

        System.out.print("END");
    }

    // public static void main(String[] args) throws Exception {
    //     circular_queue q= new circular_queue(5);

    //     q.insert(3);
    //     q.insert(5);
    //     q.insert(9);
    //     q.display();
    //     System.out.println("\n"+q.remove());
    // }
}
