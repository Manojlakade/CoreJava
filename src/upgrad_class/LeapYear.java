package upgrad_class;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Year :");
        int input=scanner.nextInt();
        LeapYear(input);
    }
    public static void LeapYear(int year)
    {

        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}

