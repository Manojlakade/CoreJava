package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        //1.collect
        list.stream().skip(1).collect(Collectors.toList());
        //shortcut
        list.stream().skip(1).toList();

        //2. forEach
        list.stream().forEach(x -> System.out.println(x));

        //3. reduce :combines elements to produce  a single result
        Optional<Integer> optionalInteger =list.stream().reduce((x,y) -> x+y);
        System.out.println(optionalInteger.get());

        //4.count

        //5.anyMath, allMath,noneMath

        boolean b=list.stream().anyMatch(x -> x%2==0 );
        boolean c=list.stream().allMatch(x -> x%2==0 );
        boolean d=list.stream().noneMatch(x -> x%2==0 );


        System.out.println(d);

        //6.findFirst,findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        //7. toArray()

        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min/max
        System.out.println("max:" + Stream.of(2,44,69).max((o1, o2) -> o2-o1));
        System.out.println("min:" + Stream.of(2,44,69).min(Comparator.naturalOrder()));

        //9.forEachOrdered
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("using for each with parallel stream");
        list3.parallelStream().forEach(System.out::println);
        System.out.println("using foreach ordered with parallel stram");
        list3.parallelStream().forEachOrdered(System.out::println);



        //examples: filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        //example: squaring and and sorting numbers
        List<Integer> list1 = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(list1.stream().map(x->x*x).sorted().toList());

        //example: summing values
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list2.stream().reduce(Integer::sum).get());


        //example: counting occurrences of a charachter
        String sentence = "hello world";
        System.out.println(sentence.chars().filter(x->x=='l').count());


    }
}
