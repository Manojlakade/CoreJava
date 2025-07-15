package Composition;

public class Main {
    public static void main(String[] args) {
        //Composition refers to "part-of" relation bw objects
        //for ex engine is part if car
        //allows complex objects to be constrcted from small objects

        Car car=new Car("fortuner",2026,"v10");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
    }
}
