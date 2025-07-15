package streams.Streams_basics;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {

        //work For You

        Function<Integer,Integer> doubleIt = X -> 2 * X;
        Function<Integer,Integer> tripleIt = X -> 3 * X;

        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt. compose(tripleIt).apply(20));//first triple then double

        System.out.println(doubleIt.apply(100));

        // static method-identity()
        Function<Integer,Integer> identity = Function.identity();
        Integer res = identity.apply(5);

        System.out.println(res);
    }
}
