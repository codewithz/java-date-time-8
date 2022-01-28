import java.time.LocalTime;

public class CreateLocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int seconds = time.getSecond();

        System.out.println(hour + " : " + minute + " : " + seconds);

        int hour1 = 23;
        int minute1 = 34;
        int seconds1 = 45;

        LocalTime time1 = LocalTime.of(hour1, minute1, seconds1);
        System.out.println(time1);

        LocalTime markerTime = LocalTime.of(14, 30);

        LocalTime set1 = LocalTime.of(11, 03, 12);

        System.out.println("Is before:" + set1.isBefore(markerTime));
        System.out.println("Is after:" + set1.isAfter(markerTime));

        LocalTime current = LocalTime.now();

        LocalTime twoHours = current.plusHours(2);
        LocalTime sixtyMinutes = current.plusMinutes(60);

        System.out.println(twoHours);
        System.out.println(sixtyMinutes);

        String timeInString = "12:01:01";

        LocalTime timeFromString = LocalTime.parse(timeInString);
        System.out.println(timeInString);
    }

}
