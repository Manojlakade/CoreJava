import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions={"whats 1+2","2*0","10*10"};
        int[][] options={{0,1,2,3},{0,1,2,3},{50,100,150,200}};
        int[] answer={4,1,2};
        int result=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
            for(int option:options[i])
            {
                System.out.print( option + " ");

            }
            System.out.println();
            System.out.print("Enter your choice :");
            int choice=scanner. nextInt();
            if(choice==answer[i])
            {
                System.out.println("CORRECT");
                result++;
            }


        }
        System.out.println("Your total score is :" + result);


    }
}
