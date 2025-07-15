package upgrad_class;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number to Reverse :");
        long input=scanner.nextLong();
        ReverseNumber(input);
    }
    public static void ReverseNumber(long n)
    {
        long result=0;
        while(n>0){

            long last=n%10;
            n/=10;
            result*=10;
            result+=last;


        }
        System.out.println("Reversed : "+result);
    }
}
