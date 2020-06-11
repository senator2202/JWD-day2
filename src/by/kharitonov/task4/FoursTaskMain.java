package by.kharitonov.task4;

public class FoursTaskMain {
    public static void main(String[] args) {
        PasswordSample obj = new PasswordSample();
        String compareMessage = obj.comparePassword(args[0]);
        System.out.println(compareMessage);
    }
}
