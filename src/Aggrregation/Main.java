package Aggrregation;

public class Main {
    public static void main(String[] args) {
        //Aggrregation = represents "has-a" relationship between objects.
        //               one object contain another object as part of it structure,
        //                but contained object can exist independently.
        Books book1=new Books("bookOne",190);
        Books book2=new Books("bookTwo",180);
        Books book3=new Books("bookThree",170);

        Books[] book={book1,book2,book3};

        //System.out.println(book1.display());
        Library library=new Library("Lakade library",1992,book);
        library.display();
    }
}
