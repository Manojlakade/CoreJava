package Inheritance.Basic_Inheritance.Super.basicInheritance;

public class Main {
    public static void main(String[] args) {
        animal animals=new animal();
        Plants plant=new Plants();
        Cat cats =new Cat();
        Dog dog=new Dog();

        animals.alive();
        cats.legs();
        cats.alive();

    }


}
