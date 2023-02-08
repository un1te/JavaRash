package l17.time;

import java.time.LocalDateTime;

public class DateTimeFormatter {

    public static void main(String[] args) {
        LocalDateTime lt = LocalDateTime.now();
        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String result = dtf.format(lt);
        System.out.println(result);
    }
}
