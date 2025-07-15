package streams.Streams_basics;

public class predicate {
    public static void main(String[] args) {
        // predicate--->Functional interface (boolean valued function)

        java.util.function.Predicate<Integer> isEven= X ->X%2 ==0;
        // System.out.println(isEven.test(4));

        java.util.function.Predicate<String> isWordStartingWithM= X -> X.toLowerCase().startsWith("m");
        java.util.function.Predicate<String> isWordEndingWithJ= X -> X.toLowerCase().endsWith("j");

        java.util.function.Predicate<String> and = isWordStartingWithM.and(isWordEndingWithJ);
        System.out.println(and.test("Manoj"));
    }
}
