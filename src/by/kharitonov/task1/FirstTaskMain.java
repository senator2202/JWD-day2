package by.kharitonov.task1;

public class FirstTaskMain {
    public static void main(String[] args) {
        NameService nameService=new NameService();
        String name = nameService.formName(args);
        Hello hello = new Hello();
        hello.printHello(name);
    }
}
