import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ApplicationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesToAccept = scanner.nextInt();
        for (int i = 0; i < linesToAccept; i++) {
            System.out.println(scanner.nextLine());
        }
        try {
            throw new Exception("hu");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek + "\n");
        System.out.println(calendar.toString());
        List<String> weekdays = Arrays.asList("Nothing", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        return weekdays.get(dayOfWeek);
    }
}
