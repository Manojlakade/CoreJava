package Collections.listInterFACE;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> fruits= new Stack<>();
        fruits.push("manoj");
        fruits.push("tushar");
        fruits.push("sangam");

        System.out.println(fruits.pop());
        System.out.println(fruits.peek());
        System.out.println(fruits.isEmpty());
    }
}
