package by.kharitonov.task1.main;

import by.kharitonov.task1.console.Hello;
import by.kharitonov.task1.service.NameService;

import java.io.IOException;

public class FirstTaskMain {
    public static void main(String[] args) {
        NameService nameService = new NameService();
        try {
            String name = nameService.formName(args);
            Hello hello = new Hello();
            hello.printHello(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
