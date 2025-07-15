package upgrad_class.OOPS;


class  student{
    String name;
    int age;

    //non parametrised constructor
    public student(){
        this.name="manoj";
        this.age=18;
    }
    //copy constructor
    public student(student Student){
        this.name=Student.name;
        this.age=Student.age;
    }
    void Display(){
        System.out.println("name :" + this.name);
        System.out.println("age" + this.age);
    }

}

public class claases_objects {

    public static void main(String[] args) {

        student st=new student();

        student st2=new student(st);
        st2.Display();


    }
}
