package upgrad_class;

public class evenWithBreak {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                if(i%5==0)
                {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
