package Collections.listInterFACE;

import java.util.EnumSet;

public class Enum   {

    enum color{
        red,green,yellows
    }

    public static void main(String[] args) {
        System.out.println(color.red);
        EnumSet<color> enumSet =EnumSet.allOf(color.class);
        System.out.println(enumSet);


    }
}
