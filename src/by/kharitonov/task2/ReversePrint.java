package by.kharitonov.task2;

public class ReversePrint {
    public void printReverse(String[] data) {
        int length = data.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
