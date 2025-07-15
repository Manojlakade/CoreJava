
package MultiThreading_ridhi;

public class Main_stack {
    public static void main(String[] args) {
        System.out.println("main is starting");

        Stack stack=new Stack(5);

        new Thread(() ->{
            int counter =0;
            while(++ counter<1045)
                System.out.println("pushed:" + stack.push(100));
        },"pusher").start();

        new Thread(() ->{
            int counter =0;
            while(++ counter<1)
                System.out.println("pushed:" + stack.pop());
        },"pusher").start();

        System.out.println("main is exiting ");


    }
}
