package Stack_Queue;

public class dynamic_stack extends custom_stack {

    public static void main(String[] args) throws Exception{
        custom_stack s = new dynamic_stack(5);
        s.push(33);
        s.push(45);
        s.push(32);
        s.push(78);
        s.push(40);
        s.push(27);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
    public dynamic_stack(){
        super();//it will call custom_stack
    }
    public dynamic_stack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFulll()){
            int[] temp =new int[data.length*2];

            //copying all previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]= data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
