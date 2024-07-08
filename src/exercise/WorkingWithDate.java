package exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class WorkingWithDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);

        LocalDate myDate = LocalDate.of(2010,04,4);
        System.out.println(myDate);

        System.out.println(myDate.plusYears(14));

        LocalDate myDate1 = LocalDate.of(2024,04,4);
        System.out.println(myDate1.getDayOfWeek());

        LocalDate myDate2 = LocalDate.of(2024,04,4);
        System.out.println(myDate2.minusYears(7).getDayOfWeek());


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
