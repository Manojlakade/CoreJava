package Thread;

public class myRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("there was an interuption");
            }

            if(i==10){
                System.out.println("times up");
                System.exit(0);
            }
        }
    }
}
