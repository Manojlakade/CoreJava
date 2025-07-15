package upgrad_class.Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number :");
        int input=scanner.nextInt();
        Pattern1(input);


    }

    public static void Pattern1(int num){
        for(int i=0;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
