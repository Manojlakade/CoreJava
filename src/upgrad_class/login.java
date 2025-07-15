package upgrad_class;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String name="manoj";
        String pass="123";

        Scanner scanner =new Scanner(System.in);
        System.out.print("enter name :");
        String name1=scanner.nextLine();
        System.out.print("enter password :");
        String pass1=scanner.nextLine();

        if(name1.equals(name) && pass1.equals(pass)){
            System.out.println("login successfull");
        }else if (name1.equals(name) || pass1.equals(pass) ){
            System.out.println("please enter correct credentials");
        }else{
            System.out.println("please register first");
        }


    }
}
