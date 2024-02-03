package org.example;

import java.util.Scanner;

public class TaskOne {

    /**
     * @author Kaynova I.S.
     * Метод описывает работу калькулятора.
     * Пользователь вводит 2 числа в формате double и выбирает доступный оператор.
     * Далее происходит вычесление и отформатированный вывод(до 4-ех знаков после запятой) в термилан.
     */
    public void run() {
        System.out.println("Введите первое число ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Введите оператор, доступные: +, -, *, /");
        String operator = new Scanner(System.in).nextLine();

        switch (operator) {
            case "+":
                System.out.printf("%.4f", a + b);
                break;
            case "-":
                System.out.printf("%.4f", a - b);
                break;
            case "*":
                System.out.printf("%.4f", a * b);
                break;
            case "/":
                System.out.printf("%.4f", a / b);
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }
}

