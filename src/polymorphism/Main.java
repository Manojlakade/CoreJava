package polymorphism;
public class Main {
    public static void main(String[] args) {

        Car1 car=new Car1();
        Bike1 bike=new Bike1();
        Boat1 boat=new Boat1();

        //car.start();
        //bike.start();
        //boat.start();

        Vehicle[] vehicles={car,bike,boat};

        for (Vehicle vehicle:vehicles)
        {
            vehicle.start();
        }

    }
}
