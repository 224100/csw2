import java.time.*;
import java.time.format.DateTimeFormatter;

public class time_ {
    public static void main(String[] args) {

        DateTimeFormatter f =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t.format(f));
    }
}