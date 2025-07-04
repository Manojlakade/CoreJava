package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Cat cat=new Cat();
        Fish fish=new Fish();
        Dog dog=new Dog();

        cat.move();
        fish.move();
        dog.move();

    }
}
