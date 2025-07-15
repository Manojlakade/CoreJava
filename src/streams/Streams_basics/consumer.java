package streams.Streams_basics;

import java.util.function.Consumer;

//takes inputt
public class consumer {
    public static void main(String[] args) {
        Consumer<Integer> print = X -> System.out.println(X);
        print.accept(51);

    }
}
