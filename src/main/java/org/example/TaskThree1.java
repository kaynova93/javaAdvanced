package org.example;
import java.util.Arrays;
public class TaskThree1 {

    int minNumber = -10, maxNumber = 10;
    static int minIndex = 0, maxIndex = 0, searchMin = 0, searchMax = 0;
    int[] arr = new int[20];
    /**
     * Запуск метода run, вызывает методы для работы
     * и вывод к консоль информации
     */
    public void run() {
        initializationArr(arr);
        System.out.println(Arrays.toString(arr));
        searchMinMax(arr);
        System.out.println("минимальный положительный элемент=" + searchMax);
        System.out.println("максимальный отрицательный элемент=" + searchMin);
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * Метод заполняем массив целыми числами от -10 до 10
     * @param arr - педаем созданный массив
     * @return наполненный элементами массив
     */
    public int[] initializationArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minNumber + (int) (Math.random() * ((maxNumber - minNumber) + 1));
        }
        return arr;
    }
    /**
     * Метод ищет максимальный отрицательный и минимальный положительный элементы массива
     * @param arr - передаем наполненный массив
     * searchMax - минимальный положительный
     * maxIndex - индекс найденного searchMax
     * searchMin - максимальный отрицательный
     * minIndex - индекс найденного searchMin
     */
    public void searchMinMax(int[] arr) {
        int countMax = 0, countMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (countMax == 0) {
                    searchMax = arr[i];
                    maxIndex = i;
                    countMax++;
                } else {
                    if (arr[i] < searchMax) {
                        searchMax = arr[i];
                        maxIndex = i;
                    }
                }
            } else if (arr[i] < 0) {
                if (countMin == 0) {
                    searchMin = arr[i];
                    minIndex = i;
                    countMin++;
                } else {
                    if(arr[i] > searchMin) {
                        searchMin = arr[i];
                        minIndex = i;
                    }
                }
            }
        }
    }
    /**
     * Меняем местами найденные элементы
     * по ранее полученным данным minIndex, maxIndex, searchMin, searchMax;
     * @param arr - массив в котором меняем
     */
    public void changeArr(int[] arr) {
        arr[minIndex] = searchMax;
        arr[maxIndex] = searchMin;
    }
}