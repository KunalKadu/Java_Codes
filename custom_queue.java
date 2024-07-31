package Stack_Queue;

public class custom_queue {
    public static void main(String[] args) throws Exception {
        custom_queue q= new custom_queue(5);
        q.insert(5);
        q.insert(1);
        q.insert(7);
        q.insert(2);
        q.insert(3);
        q.display();
        System.out.println(q.remove());
    }

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end =0;
    public custom_queue(){
        this(DEFAULT_SIZE);
    }
    public custom_queue(int size){
        this.data= new int[size];
    }
    public boolean isFull(){
        return end== data.length-1;
    }
    public boolean isEmpty(){
        return end ==0;
    }

    //insertion O(1)
    public boolean insert(int item ){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    //deletion o(N) due to shifting
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];

        for(int i =1; i<end ;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("QUeue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0; i<end;i++){
            System.out.println(data[i]+" ");
        }
        System.out.println("End");
    }
}
