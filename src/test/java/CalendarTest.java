import org.junit.Test;

import java.util.Calendar;

public class CalendarTest {
    @Test
    public void getDayFromCalendar() {

        String day = ApplicationClass.findDay(8, 5, 2015);
        System.out.println(day);

    }
}
