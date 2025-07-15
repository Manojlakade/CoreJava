package Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //LocalDate,LocalTime,LocalDateTime,UTC timestamp

        //LocalDate date=LocalDate.now();
        //LocalTime time= LocalTime.now();

        //LocalDateTime dateTime=LocalDateTime.now(); //gives date and time in 12hr format
        //Instant instant=Instant.now(); // gives date and time-in 24hour format
        // above date time is not that good to see or read so we use formatter to make it good

        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern(" dd-MM-yyyy HH:mm:ss");
        //String newDateTime =dateTime.format(formatter);

        //getting perticular date
        LocalDate date=LocalDate.of(2025,1,22);
        LocalDateTime dateTime1=LocalDateTime.of(2025,1,22,12,0,0);
        LocalDateTime dateTime2=LocalDateTime.of(2025,2,22,12,0,0);


        if(dateTime1.isBefore(dateTime2))
        {
            System.out.println(dateTime1 + "is earlier than " + dateTime2);
        }
    }
}
