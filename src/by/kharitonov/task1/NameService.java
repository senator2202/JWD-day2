package by.kharitonov.task1;

public class NameService {
    public String formName(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String s : args) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
