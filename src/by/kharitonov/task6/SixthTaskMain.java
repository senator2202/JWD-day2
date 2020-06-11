package by.kharitonov.task6;

import java.util.Calendar;

public class SixthTaskMain {
    public static void main(String[] args) {
        try {
            ParseService parseService = new ParseService();
            TaskExecutor taskExecutor = parseService.parseArgs(args);
            DateTimeService dateTimeService = new DateTimeService();
            Calendar calendar =
                    dateTimeService.calculateDateTime(taskExecutor);
            DateTimeConsole console = new DateTimeConsole();
            console.printTaskDateTime(taskExecutor.getName(), calendar);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
