package exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UsingDateTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today<'s date time (no formatting): "+ today);

        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format: "+ sdate);

        String fdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Formatted with MEDIUM FormatStyle: "+fdate);

        String kdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Formatted with SHORT FormatStyle: "+kdate);

        String pdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Formatted with LONG FormatStyle: "+pdate);
    }
}
