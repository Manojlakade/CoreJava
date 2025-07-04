public class main {
    public static void main(String[] args) {
        Car car=new Car("ford","mustang");
        //System.out.println(car.make);
        //`System.out.println(car.model);

        //Car car2= new Car();
        //System.out.println(car.make);
        //System.out.println(car.model);

        //to create different unique objects contructors come in play
        System.out.println(car.make);
        System.out.println(car.model);
        Car car2=new Car("toyota","fortuner");
        Car car3=new Car("maruti","swift");

        System.out.println(car2.make);
        System.out.println(car2.model);

        System.out.println(car3.make);
        System.out.println(car3.model);

    }
}
