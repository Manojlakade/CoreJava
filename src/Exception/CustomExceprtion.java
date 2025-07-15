package Exception;

import java.util.Scanner;

public class CustomExceprtion {
    //throws - we use throw keyword in method declaeation
    //        to declare tye of exception that might occur within
    //        it.
    //        ex public static void add() throws IOexception{
    //
    //        }
    //

    // throw - used to throw specially single exception

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        try{
            int input=scanner.nextInt();
            if (input>100)
            {
                throw new MyException("above 100 not allowed");
            }
        }catch (Exception e){
            System.out.println(e);
        }




    }
}

class MyException extends Exception
{
    public MyException(String message){
        super(message);
    }
}