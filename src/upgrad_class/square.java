package upgrad_class;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number :");
        int input=scanner.nextInt();
        System.out.println("square of "+ input + " is :"+ input*input);
    }
}
