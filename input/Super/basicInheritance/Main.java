package src.Inheritance.Basic_Inheritance.Super.basicInheritance;

public class Main {
    public static void main(String[] args) {
        Inheritance.Basic_Inheritance.Super.basicInheritance.animal animals=new Inheritance.Basic_Inheritance.Super.basicInheritance.animal();
        Inheritance.Basic_Inheritance.Super.basicInheritance.Plants plant=new Inheritance.Basic_Inheritance.Super.basicInheritance.Plants();
        Inheritance.Basic_Inheritance.Super.basicInheritance.Cat cats =new Inheritance.Basic_Inheritance.Super.basicInheritance.Cat();
        Inheritance.Basic_Inheritance.Super.basicInheritance.Dog dog=new Inheritance.Basic_Inheritance.Super.basicInheritance.Dog();

        animals.alive();
        cats.legs();
        cats.alive();

    }


}
