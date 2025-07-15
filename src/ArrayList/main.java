package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList();

        fruits.add("apple");
        fruits.add("bananna");
        fruits.add("orange");


        fruits.remove(0);
        fruits.get(1);
        fruits.set(0,"pineapple");

        // to sort arraylist
        Collections.sort(fruits);


    }
}

