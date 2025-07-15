package Basics;

import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(1,11);
        System.out.println(number);
    }

}
