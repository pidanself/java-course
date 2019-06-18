public class Queue {
    private int[] element=new int[8];
    private int size=0;
    Queue(){
    }
    public void enqueue(int v){
        element[size++]=v;
    }
    public int dequeue(){
        if(size==0) return -1;
        int t;
        t=element[--size];
        return t;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }

    public int getSize(){
        return size;
    }
}
