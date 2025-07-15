package MultiThreading;

public class Main {
    public static void main(String[] args) {
        //Multithtreading=enables a program to run mutiple programs concurrenrly
        //               (thread=set of instrctions that run independently)
        //               usefulkl for backgroud tasks

        //MyRunnable myRunnable=new MyRunnable();
        //Thread thread=new Thread(myRunnable);

        // short cut is this
        Thread thread1=new Thread(new MyRunnable());
        Thread thread2=new Thread(new MyRunnable());


        thread1.start();
        thread2.start();
    }


}
