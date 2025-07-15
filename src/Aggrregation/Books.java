package Aggrregation;

public class Books {
    String name;
    int page;

    Books(String name,int page)
    {
        this.name=name;
        this.page=page;
    }

    String display()
    {
        return this.name +" " +this.page;
    }
}
