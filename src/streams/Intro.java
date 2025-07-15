package streams;

import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
        //process collection of data in a functional and declarative manner

        //source,intermediate operations & terminal operation

        //stream-sequence of elements supporting various operations

        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().filter(x-> x%2==0).count());
        Stream<Integer> stream = numbers.stream();


        //creating streams
        // 1. from collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream1 = list.stream();

        //2.from arrays
        String[] array ={"a","b","c"};
        Stream<String> stream2 = Arrays.stream(array);
        //3. using Stream.of()
        Stream<String> a = Stream.of("a", "b");
        //4. infinite stream
        Stream<Integer> generate = Stream.generate(()->1);
        List<Integer> collect= Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);



    }


}
