package upgrad_class.OOPS;

class Students{

    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    //1 entity:Displaydetails -same method name with different parametters and bdifferent work to do
     public void DisplayDetails(String name,int age){
         System.out.println("Name and Age :"+name + ","+ age);
     }
    public void DisplayDetails(String name){
        System.out.println("Name :"+name);
    }
    public void DisplayDetails(int age){
        System.out.println("Age :"+age);
    }
}
public class polymorphism_example {
    public static void main(String[] args) {
        Students s1=new Students(22,"abhi");
        Students s2=new Students(23,"tushar");
        s1.DisplayDetails("");
    }
}
