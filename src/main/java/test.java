import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {

    public static void main(String[] args) {

        LocalDateTime lt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String result = dtf.format(lt);
        System.out.println(result);
    }


}