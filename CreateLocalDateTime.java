import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreateLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate date = dateTime.toLocalDate();
        System.out.println(date);

        LocalTime time = dateTime.toLocalTime();
        System.out.println(time);

        int dayOfMonth = 12;
        int month = 4;
        int year = 2019;
        int hour = 13;
        int min = 34;

        LocalDateTime dateTime1 = LocalDateTime.of(year, month, dayOfMonth, hour, min);
        System.out.println(dateTime1);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("LDT:" + current);
        Timestamp timestamp = Timestamp.valueOf(current);
        System.out.println("SQL Timestamp:" + timestamp);

        LocalDateTime dtFromTimestamp = timestamp.toLocalDateTime();
        System.out.println(dtFromTimestamp);

        LocalDate myDate = LocalDate.of(2013, 9, 12);
        LocalTime myTime = LocalTime.of(12, 30);

        LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);
        System.out.println(myDateTime);

    }
}
