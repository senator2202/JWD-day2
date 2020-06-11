package by.kharitonov.task5;

public class TransformService {
    public int[] toIntArray(String[] args) {
        int[] ms = new int[args.length];
        for (int i = 0; i < ms.length; i++) {
            ms[i] = Integer.parseInt(args[i]);
        }
        return ms;
    }
}
