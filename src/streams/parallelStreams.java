package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class parallelStreams {
    public static void main(String[] args) {
        //parallel streams are most effective for CPU-intensive or large datasetswere tasks are independent
        //they may add overhead for simple tasks or small datasets
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factrialslist=list.stream().map(parallelStreams::factrial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("time taken with sequential stream :" + (endTime-startTime) + " ms");

        startTime=System.currentTimeMillis();
        factrialslist=list.parallelStream().map(parallelStreams::factrial).toList();
        endTime=System.currentTimeMillis();
        System.out.println("time taken with parallel stream: " + (endTime-startTime) + "ms");


    }
    public static long factrial(int n ){
        long result=1;
        for(int i=0;i<=n;i++)
        {
            result *=i;
        }
        return result;
    }
}
