package Aggrregation;

public class Library {
    String name;
    int year;
    Books[]  book;

    Library(String name,int year,Books[] book)
    {
        this.name=name;
        this.year=year;
        this.book=book;
    }

    void display()
    {
        System.out.println("The " +this.year+ " " +this.name );
        System.out.println("The Availabele Books are :");
        for(Books bookk:book)
        {
            System.out.println(bookk.display());
        }
    }


















}
