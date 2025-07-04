public class StringMethods {
    public static void main(String[] args) {
        String name= "Manoj";

        //methods
        int length=name.length();
        char letter = name.charAt(0);
        int index=name.indexOf(" ");
        int lastIndex=name.lastIndexOf("o");
        boolean empty=name.isEmpty();
        boolean contains=name.contains(" ");
        boolean equals=name.equals("Manoj");


        //name=name.toUpperCase();
        //name=name.toLowerCase();
        //name=name.trim();
        name=name.replace("a","o");


        System.out.printf("%d\n%c\n%d\n%d\n%s\n%b\n%b\n%b",length,letter,index,lastIndex,name,empty,contains,equals );
    }
}
