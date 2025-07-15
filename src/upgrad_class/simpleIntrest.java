package upgrad_class;

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter principal amount :");
        int p=sc.nextInt();
        System.out.print("enter rate of intrest:");
        int r=sc.nextInt();
        System.out.print("enter time  :");
        int t=sc.nextInt();

        int si=(p*r*t)/100;
        System.out.println("SIMPLE INTREST : "+si);
        sc.close();

    }
}
