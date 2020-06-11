package by.kharitonov.task7;

import java.util.Calendar;

public class DateService {
    public int calculateFullYears(Calendar birthDay) {
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
    }

    public int getDayOfWeek(Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public boolean isBirthDay(Calendar calendar) {
        Calendar today = Calendar.getInstance();
        return ((today.get(Calendar.DATE) == calendar.get(Calendar.DATE)) &&
                (today.get(Calendar.MONTH) == calendar.get(Calendar.MONTH)));
    }
}
