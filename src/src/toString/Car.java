package toString;

public class Car {
    String name;
    String brand;
    int year;

    Car(String name,String brand,int year)
    {
        this.name=name;
        this.brand=brand;
        this.year=year;
    }
    @Override
    public String toString()
    {
        return this.name + this.brand +" "+ this.year;
    }

}
