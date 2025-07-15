package MultiThreading_ridhi;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("main is starting");
        Thread thread =new Thread(()-> {
            System.out.println(Thread.currentThread());
        },"Our Thread");

        thread.start();
        System.out.println(thread.getPriority());
        thread.setPriority(10);
        System.out.println(thread.getPriority());


        //note -> there is no guarantee that jvm will follow the priority give by u.

    }
}
