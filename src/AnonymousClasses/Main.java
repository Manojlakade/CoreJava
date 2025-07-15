package AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        //anonymous class= a class that doesntt have name .cannot be reused.
        //                 adds custom behavior without having to create a new class.
        //                 often used for one time use.
        Doggy doggy1=new Doggy();
        Doggy doggy2=new Doggy(){
            @Override
            void speak(){
                System.out.println("gavti dog says AAAUUUUU AAU AAU");
            }
        };


        doggy1.speak();
        doggy2.speak();
    }
}
