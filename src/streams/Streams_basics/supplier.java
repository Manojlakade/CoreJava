package streams.Streams_basics;

import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "hello world";
        System.out.println(giveHelloWorld.get());
    }
}
