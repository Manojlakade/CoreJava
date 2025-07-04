package Abstract;

public class Triangle extends Shape{
    double length;
    double  breadth;
    @Override
    double area()
    {
        return length*breadth*0.5;
    }
}
