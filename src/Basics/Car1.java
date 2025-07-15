package Basics;

public class Car1 {
    //array of objects
    String model;
    String color;

    Car1(String model,String color)
    {
        this.model=model;
        this.color=color;
    }

    void drive()
    {
        System.out.println("you drive " + this.color +" "+ this.model );
    }




}
