package MultiThreading_ridhi;

public class join {
    public static void main(String[] args) {
        System.out.println("main is starting");
        Thread thread =new Thread(()-> {
            System.out.println(Thread.currentThread());
        },"Our Thread");

        thread.start();
        try{
            thread.join(); // it block main thread and completes its tasks first and then stats main again
        }catch (InterruptedException e){
            //todo auto generated catch block
            e.printStackTrace();
        }
        System.out.println("main is exiting");
    }
}
