package MultiThreading_ridhi;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("main is starting");

        //creating by extending thread class
        Thread thread1=new Thread1();
        //java please run my thread1
        thread1.setDaemon(true);
        thread1.start();

        //thread2-creating by implementing runnable interface
//        Thread thread2= new Thread(new Thread2());// "new Thread2 is a task given to Thread"
        //thread takes object and then runs it
//        thread2.start();

        //USING LAMBDA EXPRESSION

        Thread thread2= new Thread(()->
        {
            for(int i =0;i<=5;i++){
                System.out.println(Thread.currentThread() + ","+i);
            }
        },"thread2");
        thread2.start();

        System.out.println("main is exiting");

        new Thread().run();
    }
}
