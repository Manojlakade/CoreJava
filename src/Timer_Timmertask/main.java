package Timer_Timmertask;

import java.util.Timer;
import java.util.TimerTask;

public class main {
    public static void main(String[] args) {
        //timer= class that schedules tasks at specific times or periodically
        //       usefull for sending notifivcations,scheduled upxates,repetetkive work

        //TimerTask=Represents the tasks that will be executed by the timer
        //          yo will extend timer class to define your task
        //          creates a subclass of TimerTask and @override run()

        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {

            int count=3;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("happy new year");
                    timer.cancel();

                }

            }
        };
        timer.schedule(timerTask,2000,1000); // (task,delay in ms,repeat periodically in ms)
    }
}
