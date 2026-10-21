import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        System.out.println("Date: " + gcal.get(Calendar.DATE) + "/" + (gcal.get(Calendar.MONTH) + 1) + "/" + gcal.get(Calendar.YEAR));
        System.out.println("Time: " + gcal.get(Calendar.HOUR) + ":" + gcal.get(Calendar.MINUTE) + ":" + gcal.get(Calendar.SECOND));

        int year = gcal.get(Calendar.YEAR);
        if (gcal.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}