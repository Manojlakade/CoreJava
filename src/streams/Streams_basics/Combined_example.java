package streams.Streams_basics;

import java.util.List;
import java.util.function.*;
import java.util.Arrays;

public class Combined_example {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2==0;
        Function<Integer,Integer> function= x -> x*x;
        Consumer<Integer> consumer=x -> System.out.println(x);
        Supplier<Integer> supplier= ()  -> 100;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }

        //BIPredicate,BIConsumer,BiFunction

        BiPredicate<Integer,Integer> isSumEven =(x,y) -> (x+y)%2==0;
        System.out.println(isSumEven.test(5,5));

        //UnaryOperator , BinaryOperator
        UnaryOperator<Integer> a=x -> x * 2;
        BinaryOperator<Integer> b=(x,y) -> x+y;

        //Method reference -->use method without invoking it & in place of lambda expression
        List<String> students = Arrays.asList("RAM","SHYAM","GHANSHYAM");
        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);


        //constructor reference




    }

}

class mobilePhone{
    String name;

}