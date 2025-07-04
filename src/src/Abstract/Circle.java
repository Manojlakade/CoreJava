package Abstract;

public class Circle extends Shape{
    double radius=10;
    @Override
    double area()
    {
        return Math.PI*radius*radius;
    }
}
