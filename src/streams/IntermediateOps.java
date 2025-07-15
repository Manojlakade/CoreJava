package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        //intermediarte opertions tranform a stream into another stream
        //They are lazy,meaning they dont execute until a terminal operation is invoked.


        //1. filter
        List<String> list = Arrays.asList("akshay", "ram", "shyam");
        Stream<String> filterStream =list.stream().filter(x->x.startsWith("a"));
        //no filtering at this point
        Long res=list.stream().filter(x->x.startsWith("a")).count();//.count is a terminal Operation
        System.out.println(res);


        //operations
        //2.map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        //3.sorted
        Stream<String> sortedStream =list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) -> a.length()-b.length());


        //4. distinct
        System.out.println(list.stream().filter(X -> X.startsWith("a")).distinct().count());

        //5. limit
        System.out.println(Stream.iterate(1,X -> X+1).limit(100).count());

        //6.skip
        System.out.println(Stream.iterate(1,X -> X+1).skip(10).limit(100).count());

        //7.peek
        //performs an action on each element is is consumed.
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

        //8. flatmap
        // handels nested collections,lists,or arrays where each element is itself collecion
        //flatten  nested structure (eg. lists within lists) so that they can be processed as a
        //transorm and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple","bananna"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grape")
        );

        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList());







    }
}
