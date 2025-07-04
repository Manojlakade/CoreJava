package Inheritance.Basic_Inheritance.Super;

public class Student extends Person{
    int cgpa;

    Student(String first,String last,int cgpa){
        //this.first=first;
        //this.last=last;
        super(first,last);//you acces constructor of parent class this way
        //you can access methods by super.methodname(),sudent.variableName;
        this.cgpa=cgpa;
    }
    void display1()
    {
        System.out.println(this.first +" Your cgpa is "+ this.cgpa);
    }
}
