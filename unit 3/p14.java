import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        System.out.println("Format 1 (dd/MM/yyyy): " + now.format(fmt1));
        System.out.println("Format 2 (yyyy-MM-dd HH:mm:ss): " + now.format(fmt2));
        System.out.println("Format 3 (EEEE, MMM dd, yyyy): " + now.format(fmt3));
    }
}