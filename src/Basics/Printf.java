package Basics;

public class Printf {
    public static void main(String[] args) {
        int age=18;
        boolean student=true;
        String name="Manoj";
        double num2=9.993747;
        //%[flag][width][.precision][specifier charachter]
        System.out.printf("My name is %s and my age is %d, i am a student : %b and i got %.2f",name,age,student,num2);
    }



}
