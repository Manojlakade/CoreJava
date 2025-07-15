package upgrad_class;

import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter marks of student : ");
        int marks= scanner.nextInt();
        switch(marks/10){
            case 10:
                System.out.println("A+ GRADE");
                break;
            case 9:
                System.out.println("A GRADE");
                break;
            case 8:
                System.out.println("B+ GRADE");
                break;
            case 7:
                System.out.println("B GRADE");
                break;
            case 6:
                System.out.println("C+ GRADE");
                break;
            case 5:
                System.out.println("C GRADE");
                break;
            default:
                System.out.println("FAIL");

        }
    }
}
