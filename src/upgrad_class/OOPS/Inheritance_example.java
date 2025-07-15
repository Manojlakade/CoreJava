package upgrad_class.OOPS;

class Shape{
    //base class
    public void area(){
        System.out.println("calculating area of shape");
    }
}
class Triangle extends Shape{
    //derived class
    @Override
    public void area(){
        System.out.println("calculating area of triangle");
    }
}


public class Inheritance_example {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Triangle triangle=new Triangle();
        shape.area();
        triangle.area();
    }
}
