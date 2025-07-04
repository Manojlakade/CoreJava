package Abstract;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();

        rectangle.display();
        circle.display();
        triangle.display();
        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(triangle.area());
    }
}
