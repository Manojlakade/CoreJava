package upgrad_class;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("choose 1 for action \nchoose 2 for comedy \nchoose 3 for drama  ");
        System.out.print("enter choice  : ");
        int num=scanner.nextInt();
        switch(num) {
            case 1:
                System.out.println("action");
                break;
            case 2:
                System.out.println("comdey");
                break;
            case 3:
                System.out.println("drama");
                break;
            default:
                System.out.println("invalid choice");
        }
        scanner.close();
    }
}
