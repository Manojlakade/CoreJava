package streams;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
     //collectors is a utility class
     //provides a set of methods to create common collectors

        //1.collecting to list
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> res = names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());
        System.out.println(res);

        //2. collecting to a set
        List<Integer> nums= Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> set=nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        //3. collecting to a specific collection
        names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));

        //4.joining strings
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        //


    }
}
