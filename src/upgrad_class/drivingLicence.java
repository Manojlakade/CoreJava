package upgrad_class;

import java.util.Scanner;

public class drivingLicence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter age of person : ");
        int age=scanner.nextInt();


        if(age>18){
            System.out.print("type true if haves licence else false :");
            boolean dl=scanner.nextBoolean();
            if(dl==true)
            {
                System.out.println("Elegible to drive");
            }
            else{
                System.out.println("not elegible to drive");
            }
        }else{
            System.out.println("not elegible to drive");
        }

    }
}
