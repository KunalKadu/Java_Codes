package Stack_Queue;

public class custom_stack {
    // public static void main(String[] args) throws Exception {
    //     custom_stack s= new custom_stack(5);
    //     s.push(3);
    //     s.push(1);
    //     s.push(7);
    //     s.push(31);
    //     s.push(18);

    //     System.out.println(s.pop());
    //     System.out.println(s.pop());
    //     System.out.println(s.pop());
    //     System.out.println(s.pop());
    //     System.out.println(s.pop());

    // }


    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public custom_stack(){
        this(DEFAULT_SIZE);
    }
    public custom_stack(int size){
        this.data = new int[size];
    }
    int ptr =-1;

    public boolean push(int item){
        if(isFulll()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public boolean isFulll(){
        return ptr == data.length - 1;
    }//ptr is at last index
    private boolean isEmpty(){
        return ptr ==-1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack !!");
        }
        return data[ptr];
    }
}
