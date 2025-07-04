public class ellipsis {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
    }
    //varars
    static int add(int ... numbers)
    {
        int total=0;
        for (int num:numbers)
        {
            total+=num;
        }
        return total;
    }


}
