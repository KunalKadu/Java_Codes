package Generics;

import java.util.Arrays;

public class CustomGenericsAL <T>{
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomGenericsAL(){
        data=new Object[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size== data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length*2];

        //copy all items in current array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data= temp;
    }
    public int remove(){
        int remove = (int)data[--size];
        return remove;
    }
    public T get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index , T value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "CustomArrayList {"+ "data"+ Arrays.toString(data)+",size ="+size + "}";
    }
    public static void main(String[] args) {
        CustomGenericsAL<Integer> list = new CustomGenericsAL<>();
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);
    }
}
