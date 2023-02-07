import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());

        LocalDate tod = LocalDate.ofYearDay(2020, 256);

        System.out.println(">> " + tod);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        String inputString1 = "12 09 2020";
        String inputString2 = "01 01 1970";

        LocalDateTime date1 = LocalDate.parse(inputString1, dtf).atStartOfDay();
        LocalDateTime date2 = LocalDate.parse(inputString2, dtf).atStartOfDay();
        long daysBetween = Duration.between(date1, date2).toDays();
        System.out.println("Days: " + daysBetween);
    }

}