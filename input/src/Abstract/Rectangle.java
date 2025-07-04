package Abstract;

public class Rectangle extends Shape{
    double length=2;
    double breadth=3;
    @Override
    double area()
    {
        return length*breadth;
    }
}
