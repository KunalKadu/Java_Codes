package Stack_Queue;

public class dynamic_queue extends circular_queue{
    public dynamic_queue(){
        super();
    }
    public dynamic_queue(int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if(this.isFull()){
            //here we are not going to  return false but we are going to increment the 
            //size of the queue
            int[] temp = new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i) % data.length];
            }
            front =0;
            end=data.length;
            data= temp;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        dynamic_queue q= new dynamic_queue(5);

        q.insert(3);
        q.insert(5);
        q.insert(9);
        q.display();
        System.out.println("\n"+q.remove());
    }
}
