package upgrad_class;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int n){
        int factorial=1;
        while(n>0)
        {
            factorial*=n;
            n--;
        }
        return factorial;
    }

}
