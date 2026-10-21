import java.util.Calendar;

public class CalendarModifyDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date: " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After adding 10 days: " + cal.getTime());

        cal.add(Calendar.MONTH, -2);
        System.out.println("After subtracting 2 months: " + cal.getTime());
    }
}