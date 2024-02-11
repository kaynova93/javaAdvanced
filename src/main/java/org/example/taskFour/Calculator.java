package org.example.taskFour;

import org.example.taskFour.operators.Sum;
import org.example.taskFour.parser.CalcParser;

import java.util.Scanner;

public class Calculator {

    private CalcParser calcParser;
    private static final String RESULT = "Итог = ";

    public Calculator(CalcParser calcParser) {
        this.calcParser = calcParser;
    }

    /**
     * Метод для запуска калькулятора
     * @param num1      - число 1
     * @param operation - операция
     * @param num2      - число 2
     */
    public void calculate(Double num1, String operation, Double num2) {
        final Sum sum = calcParser.parse(num1, operation, num2);
        System.out.printf(RESULT +"%.2f",sum.result());

    }
}
