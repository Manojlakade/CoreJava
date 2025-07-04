package Interface;

public class Fish implements Prey,Predetor{
    @Override
    public void escape()
    {
        System.out.println("Fish is running from from large fishes");
    }
    @Override
    public void hunt()
    {
        System.out.println("Fish eats small fishes then them");
    }
}
