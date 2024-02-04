package org.example;

import java.util.Scanner;

public class TaskTwo {
    /**
     * @author Kaynova I.S.
     * Изначально метод предлагает пользователю выбор программы.
     * 1- калькулятор, 2 -массив строк
     * Если пользователь вводит 1, то запускается калькулятор из первой задачи.
     * Если пользователь вводит 2, то запускается программа для массива строк.
     */
    public void run() {
        System.out.println("Выедите номер задачи: 1- калькулятор, 2 -массив строк");
        int task = new Scanner(System.in).nextInt();
        if (task == 1) {
            TaskOne calculator = new TaskOne();
            calculator.run();
        } else if (task == 2) {
            System.out.println("Введите размер массива строк");
            String[] arr = new String[new Scanner(System.in).nextInt()];
            int maxLengthStr = 0;
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                System.out.println("введите слово " + i);
                arr[i] = new Scanner(System.in).nextLine();
                if (maxLengthStr < arr[i].length()) {
                    result = arr[i];
                }
            }
            System.out.println("Самое длинное слово в массиве: " + result);
        } else {
            System.out.println("Нет такой задачи");
        }
    }
}
