package Generics;

public class genericMethod {
    public static void main(String[] args) {
        printdata(123);
        printdata("manoj");

        //without static
        //GenericMethods obj=new GenericMethods)();
        //obj.DoubleData("abc");

    }

    public static  <T> void printdata(T data)
    {
        System.out.println(data);
    }

    //method without static keyword
    <E> void DoubleData(E data)
    {
        System.out.println(data);
    }
}

