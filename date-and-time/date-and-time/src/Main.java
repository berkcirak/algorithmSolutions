import java.util.Calendar;

public class Main {

    public static String getDay(int day, int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String [] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
        "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }


    public static void main(String[] args) {
        System.out.println(getDay(10, 06, 2003));
    }
}