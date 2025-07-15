package Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //threading :allows a program to run multiple tasks simultamepusly
        //           helps improve performace with time consuming oprations

        // how to create a thread
        //1.extend thred class
        //2.implement runnable interface
        Scanner scanner=new Scanner(System.in);
        System.out.println("You have 10 seconds to enter your name");

        myRunnable myrunnable=new myRunnable();
        Thread thread=new Thread(myrunnable);
        thread.setDaemon(true);                      //end all threads and exit when main thread is executed
        thread.start();

        System.out.print("enter your name :");
        String name=scanner.nextLine();
        System.out.println("hello " + name);

    }
}
