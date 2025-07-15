package MultiThreading_ridhi;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;


    public Stack(int capacity)
    {
        array=new int[capacity];
        stackTop=-1;
        lock =new Object();

    }

    public boolean push(int element){
        synchronized(lock){
//  public boolean push(int element){
//      synchronized(lock){
//      ****shortcut****
//  public sychronised boolean push(int element){ (it uses "this" as lock behind the scene)

            if(isFull()) return false;
            ++ stackTop;

            try{ Thread.sleep(1000);} catch (Exception e){ }
            array[stackTop]=element;
            return true;
        }

    }

    public int pop(){
        synchronized(lock){
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj=array[stackTop];
            array[stackTop]=Integer.MIN_VALUE;
            try{ Thread.sleep(1000);} catch (Exception e){ }
            stackTop --;
            return obj;
        }

    }
    public boolean isEmpty()
    {
        return stackTop<0;
    }
    public boolean isFull()
    {
        return stackTop>= array.length-1;
    }

}
