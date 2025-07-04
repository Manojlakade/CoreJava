import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        //JAVA DICE ROLLER PROGRAM

        //DECLARE VARIABLES
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();
        int Choice;
        int Total = 0;
        //GET # OF ROLLS FROM USER
        System.out.print("Enter Number Of Times To Roll Dice :");
        Choice=scanner.nextInt();
        //CHECK IF # IS > 0
        if(Choice>0){
            for(int i=1;i<=Choice;i++)
            {
                int randNumber=random.nextInt(1,7);
                System.out.printf("%d Number is : %d \n",i,randNumber);
                display(randNumber);
                Total+=randNumber;
            }
            System.out.println(Total);

        }else{
            System.out.println("Invalid Choice");
        }
        //ROLL ALL DICE
        //GET TOTAL
        //DISPLAY
    }
    static void display(int num){
            String dice1= """
                    -------
                   |       | 
                   |   ⬤   |
                   |       |
                    -------
                    """;
            String dice2= """
                    -------
                   | ⬤    |
                   |      |
                   |    ⬤ |
                    -------
                    """;
            String dice3= """
                    -------
                   | ⬤    |
                   |  ⬤  |
                   |    ⬤ |
                    -------
                    """;
            String dice4= """
                    -------
                   | ⬤   ⬤|
                   |       |
                   | ⬤   ⬤|
                    -------
                    """;
            String dice5= """
                    -------
                   | ⬤   ⬤|
                   |   ⬤  |
                   | ⬤   ⬤|
                    -------
                    """;
            String dice6= """
                    -------
                   | ⬤ ⬤ ⬤|
                   |       |
                   | ⬤ ⬤ ⬤|
                    -------
                    """;
            switch(num)
            {
                case 1-> System.out.println(dice1);
                case 2-> System.out.println(dice2);
                case 3-> System.out.println(dice3);
                case 4-> System.out.println(dice4);
                case 5-> System.out.println(dice5);
                case 6-> System.out.println(dice6);
            }


        }
}
