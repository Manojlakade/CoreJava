public class Main1 {
    public static void main(String[] args) {
        //Car1 car1=new Car1 ("fortuner","black");
        //Car1 car2=new Car1("scorpio 80","white");

        //Car1[] cars={car1,car2};
        Car1[] cars={new Car1 ("fortuner","black"),
                new Car1("scorpio 80","white")} ;
        for (Car1 car:cars)
        {
            car.color="black";
        }
        for (Car1 car:cars)
         {
             car.drive();
         }

    }
}
