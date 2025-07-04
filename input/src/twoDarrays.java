public class twoDarrays {

    public static void main(String[] args) {
        String[][] food={{"apple","bananna"},{"chicken","eggs"},{"potatto","brinjal"}};
        int m=2;
        int n=2;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(food[i][j] + " ");
            }
        }
    }
}
