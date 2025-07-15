package upgrad_class.Patterns;

public class Pattern3 {
    //    **********   i=1 star=5 space=0
    //    ****  ****    i=2 star=4 space=2
    //    ***    ***    i=1 star=5 space=4
    //    **      **    i=1 star=5 space=6
    //    *        *    i=1 star=5 space=8
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    public static void main(String[] args) {
        int n = 5;
        int st=n;
        int st2=n;
        int spaces=0;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=st;j++)
            {
                System.out.print("*");
            }
            st--;

            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            spaces+=2;
            for(int j=1;j<=st2;j++)
            {
                System.out.print("*");
            }
            st2--;
            System.out.println();
        }
        //second half
        for (int i = 1; i <=n; i++) {
            for(int j=15;j<=st;j++)
            {
                System.out.print("*");
            }
            st--;

            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            spaces+=2;
            for(int j=1;j<=st2;j++)
            {
                System.out.print("*");
            }
            st2--;
            System.out.println();
        }

    }
}



