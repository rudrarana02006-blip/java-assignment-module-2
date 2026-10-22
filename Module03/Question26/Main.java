import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date using java.util.Date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Date using java.util.Calendar: " + day + "/" + month + "/" + year);
        System.out.println("Time using java.util.Calendar: " + hour + ":" + minute + ":" + second);
    }
}
