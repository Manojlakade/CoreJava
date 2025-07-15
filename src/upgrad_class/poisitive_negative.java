package upgrad_class;

import java.util.Scanner;

public class poisitive_negative {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= scanner.nextInt();
        if (num>0)
        {
            System.out.println("positive");
        }else if(num==0){
            System.out.println("zero");
        }else{
            System.out.println("negative");
        }
    }

}
