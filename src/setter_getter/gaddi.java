package setter_getter;

public class gaddi {
    private final String model; // adding final helps in makimng it permanent,i.e it cant be changed even by setter
    private String color;
    private int price;

    gaddi(String model,String color,int price )
    {
        this.model=model;
        this.color=color;
        this.price=price;
    }

    int getPrice()
    {
        return this.price;
    }

    void setColor()
    {
        this.color="white";
    }
    void setPrice()
    {
        this.price=30;
    }
    String getModel()
    {
        return this.model;
    }
    String getColor()
    {
        return this.color;
    }

}
