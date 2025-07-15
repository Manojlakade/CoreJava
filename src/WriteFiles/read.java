package WriteFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        //read files using java
         // BufferedReader + FileReader : best for reading rext files line by line
        String filePath="C:\\java\\Java Core\\test.txt";

        try(BufferedReader reader =new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line=reader.readLine())!= null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("file not found");
        }
    }
}
