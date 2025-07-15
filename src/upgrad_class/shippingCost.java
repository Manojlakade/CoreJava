package upgrad_class;

import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter amount :");
        int amount=scanner.nextInt();

        if(amount>100)
        {
            System.out.println("shipping is free total payable : " + amount);
        }else if (amount<=99 && amount>=50)
        {
            amount +=5;
            System.out.println("total amount with shipping : " + amount);
        }else{
            amount +=10;
            System.out.println("total amount with shipping : " + amount);
        }
    }
}
