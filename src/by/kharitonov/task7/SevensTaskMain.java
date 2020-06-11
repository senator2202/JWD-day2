package by.kharitonov.task7;

import java.util.Calendar;

public class SevensTaskMain {
    public static void main(String[] args) {
        try {
            DateParser dateParser = new DateParser();
            Calendar calendar = dateParser.parseDate(args[0]);
            DateService dateService = new DateService();
            int dayOFWeek = dateService.getDayOfWeek(calendar);
            int fullYears = dateService.calculateFullYears(calendar);
            boolean isBirthday = dateService.isBirthDay(calendar);
            DateConsole dateConsole = new DateConsole();
            dateConsole.printDayOfWeek(dayOFWeek);
            dateConsole.printFullYears(fullYears);
            dateConsole.printBirthdayCelebration(isBirthday);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
