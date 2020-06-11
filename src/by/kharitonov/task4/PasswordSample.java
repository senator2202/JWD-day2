package by.kharitonov.task4;

public class PasswordSample {
    private static final String SAMPLE = "qwerty";

    public String comparePassword(String password) {
        StringBuilder message = new StringBuilder("Password ");
        if (password.compareTo(SAMPLE) == 0) {
            message.append("matches ");
        } else {
            message.append("doesn't match ");
        }
        message.append("the sample!");
        return message.toString();
    }
}
