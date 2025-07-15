package Runtime_Polymorphism;

import java.util.Scanner;

public class Main {
    //Runitme polymorphism is achived  by method overriding at runtime
    public static void main(String[] args) {
        //Cat_poly cat=new Cat_poly();
        //Dog_poly dog=new Dog_poly();
        Animal animal;
        Scanner scanner=new Scanner(System.in);
        System.out.print("to listen dogs sound press 1 else for cat press 2   :");
        int input= scanner.nextInt();
        if(input==1)
        {
            animal=new Dog_poly();
            animal.speak();
        }else if (input==2){
            animal=new Cat_poly();
            animal.speak();
        }


    }



}
