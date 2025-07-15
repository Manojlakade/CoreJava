package WriteFiles;

import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        String path="test.txt";
        String text="i like pizza\n i eat it frequently";
        try(FileWriter writer=new FileWriter(path))
        {
            writer.write(text);
            System.out.println("file has been written");
        }
        catch(IOException e){
            System.out.println("could not write file");
        }

    }
}
