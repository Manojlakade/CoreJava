package Generics;

public class Main {
    public static void main(String[] args) {
        //Generics = a concept were u can write class,interface,or method
        //           that is compatible with different datatypes.
        //           <T> type parameter (placeholder that replaced with
        //            <String> type argument (specifies the type)

        Box<Integer> box=new Box<>();
        box.setItem(12);
        System.out.println(box.getItem());
    }
}
