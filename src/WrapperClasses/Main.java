package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        //Wrapper classes= all0ws primitive values (int char double boolean)
         //                to be used as objects.wrap them in a object.
         //                generally u dont wrap primitive values unless u need an object.
         //

        //Autoboxing
        Integer a_=20;                    //shortcut for wrapping
        Double b=3.14;
        Character c='$';
        Boolean d=true;

        // Unboxing
        int x=a_;

        //converting to string
        String aa= Integer.toString(123);
        String bb=Double.toString(3.14);

        // convering string to diff primitive datatypes
        int aaa=Integer.parseInt("abc");
        double bbb=Double.parseDouble("abcd");

        //is letter

        char letter='c';
        System.out.println(Character.isLetter(letter  ));




    }

}

