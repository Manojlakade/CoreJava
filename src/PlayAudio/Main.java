package PlayAudio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //play audio with java

        String filePath ="C:\\Users\\Admin\\Downloads\\music.wav";
        File file=new File(filePath);

        try(Scanner scanner=new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


            Clip clip= AudioSystem.getClip();
            clip.open(audioStream);

            String response= " ";
            while (!response.equals("Q"))
            {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("Enter Your Choice :");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "p" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");

                }
            }
        }catch (IOException e){
            System.out.println("something went wrong ");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audiofile is not supported");;
        } catch (LineUnavailableException e) {
            System.out.println("unable to acces audio resource");
        }finally{
            System.out.println("bye");
        }

    }

}
