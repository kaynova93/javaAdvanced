package org.example;

import org.example.taskFour.Calculator;


import java.io.IOException;


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

        Calculator calculator2 = new Calculator(2.0,2.0);
        System.out.println(calculator2.addition());

        Calculator calculator = new Calculator(2.0,2.0,"+");
        calculator.calculate();

//        Reader r = new Reader();
//        List<String> listString = r.read();
//        System.out.println("Прочитанные данные = \n"+ listString);
//        TaskFive taskFive = new TaskFive();
//        taskFive.sortList(listString);
//        System.out.println("Отсортированные данные = \n" + listString);
//        taskFive.counterDuplicate(listString);
//        taskFive.printResult();
    }
}