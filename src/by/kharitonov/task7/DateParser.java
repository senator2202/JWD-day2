package by.kharitonov.task7;

import java.util.Calendar;

public class DateParser {
    public Calendar parseDate(String date){
        Calendar calendar = Calendar.getInstance();
        String[] ddmmyy = date.split("[.,\\\\/]");
        int dd = Integer.parseInt(ddmmyy[0]);
        int mm = Integer.parseInt(ddmmyy[1]) - 1;
        int yy = Integer.parseInt(ddmmyy[2]);
        calendar.set(yy, mm, dd);
        return calendar;
    }
}
