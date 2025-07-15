package streams.Streams_basics;

public class Lambda {
    public static void main(String[] args) {
        MathOperation sumOperation=(a,b)-> a+b;
        MathOperation subOperation=(a,b)-> a-b;
        MathOperation multOperation=(a,b)-> a*b;
        MathOperation divideOperation=(a,b)-> a/b;

        int res=sumOperation.operate(2,3);
        System.out.println(res);

    }
}

// RATHER THAN WRITING WHOLE NEW CLASS FOR SUMPERATION WE
// WRITE LAMBDA FUNCTION AS ON LINE 5


//class Sumoperation implements MathOperation{
//    @Override
//    public int operate(int a,int b ){
//        return a + b;
//    }
//}

@FunctionalInterface
//anotation-this tells that thhis is a functional interface only one
// abstract method should be given
interface MathOperation {
    int operate(int a , int b );
}
