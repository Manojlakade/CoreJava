package upgrad_class;

import java.util.Scanner;

public class FibonacieSeries {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number of series u want :");
        int input=scanner.nextInt();
        fibo(input);
    }
    public static void fibo(int n){
        int first = 0;
        int last = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+".Number is :"+first + "\n ");
            int next = first + last;
            first = last;
            last = next;

        }
    }
}
