package org.example;

import org.example.TaskFive.Reader;
import org.example.TaskFive.TaskFive;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
//        TaskOne one = new TaskOne();
//        one.run();

//        TaskTwo two = new TaskTwo();
//        two.run();

//        TaskThree1 three = new TaskThree1();
//        three.run();

//        TaskThree2 three2 = new TaskThree2();
//        three2.run();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число : ");
//        Double num1 = scanner.nextDouble();
//         System.out.println("Введите операцию - +,-,*,/ : ");
//        String operation = new Scanner(System.in).nextLine();
//         System.out.println("Введите второе число : ");
//        Double num2 = scanner.nextDouble();
//        scanner.close();
//        final CalcParser calcParser = new CalcParser();
//        final Calculator calculator = new Calculator(calcParser);
//        calculator.calculate(num1, operation, num2);


        Reader r = new Reader();
        List<String> listString = r.read();
        System.out.println("Прочитанные данные = \n"+ listString);
        TaskFive taskFive = new TaskFive();
        taskFive.sortList(listString);
        System.out.println("Отсортированные данные = \n" + listString);
        taskFive.counterDuplicate(listString);
        taskFive.printResult();
    }
}