import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"mango", "apple", "banana", "coconut"};
        /*for(int i=0;i<=fruits.length;i++){
            System.out.println(fruits[i]);
        }
         */

        //enhanced for loop

       /* Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        */

        String[] food = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < food.length; i++) {
            System.out.println("enter food");
            food[i] = scanner.nextLine();
        }
        for(String j1:food)
        {
            System.out.println(j1);
        }

    }
}
