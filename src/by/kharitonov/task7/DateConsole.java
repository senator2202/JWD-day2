package by.kharitonov.task7;

public class DateConsole {
    public void printDayOfWeek(int day) {
        String result = "";
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                break;
        }
        System.out.println("You was born on: " + result);
    }

    public void printFullYears(int years) {
        System.out.println("You are " + years + " years old");
    }

    public void printBirthdayCelebration(boolean isTrue) {
        if (isTrue) {
            System.out.println("Happy birthday!");
        }
    }
}
