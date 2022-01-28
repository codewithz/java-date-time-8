import java.time.*;
import java.util.Date;

public class CreateLocalDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = 2021;
        int month = 03;
        int dayOfMonth = 30;

        LocalDate date1 = LocalDate.of(year, month, dayOfMonth);
        System.out.println(date1);

        Month monthFromDate = date1.getMonth();
        System.out.println(monthFromDate);

        int monthInInteger = date1.getMonthValue();
        System.out.println("Month is :" + monthInInteger);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate currentPlusFive = date.plusDays(5);
        System.out.println(date + " after 5 days " + currentPlusFive);

        LocalDate afterOneMonth = currentPlusFive.plusMonths(1);
        System.out.println(afterOneMonth);

        int lengthOfYear = date.lengthOfYear();
        System.out.println(lengthOfYear);

        int lengthOfMonth = currentPlusFive.lengthOfMonth();
        System.out.println(lengthOfMonth);

        Date dt = new Date();

        LocalDate localDateFromDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println(dt + " --- " + localDateFromDate);

        String dateInStringFormat = "2020-09-12";

        LocalDate dateFromString = LocalDate.parse(dateInStringFormat);
        System.out.println(dateInStringFormat);

        String stringFromDate = dateFromString.toString();

        System.out.println(stringFromDate);

    }
}