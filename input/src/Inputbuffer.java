import java.util.Scanner;
public class Inputbuffer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Age :");
        int age=input. nextInt();
        //following line takes "ENTER" and removes input buffering
        input.nextLine();
        System.out.print("Enter Name :");
        String name=input.nextLine();
        System.out.println("Done !!!!!!!!!!!");

    }
}
