package org.example.taskThree2;

public class SweetGift {
    Candy[] candy;

    /**
     * Конструктор
     * @param candy - принимает массив конфет
     */
    public SweetGift(Candy... candy) {
        this.candy = candy;
    }

    /**
     * Получить общий вес подарка
     */
    public void getWeight() {
        double resultWeight = 0;
        for (int i = 0; i < candy.length; i++) {
            resultWeight += candy[i].getWeight();
        }
        System.out.printf("Общий вес подарка : %.2f\n", resultWeight);
    }

    /**
     * Получить общую стоимость подарка
     */
    public void getPrice() {
        double resultPrice = 0;
        for (int i = 0; i < candy.length; i++) {
            resultPrice += candy[i].getPrice();
        }
        System.out.printf("Стоимость подарка : %.2f", resultPrice);
    }

    /**
     * получить инф. о конфетах в подарке
     */
    public void getInfoCandy() {
        for (int i = 0; i < candy.length; i++) {
            System.out.println("Позиция в подарке: " + i);
            System.out.println(candy[i].toString());
        }
    }
}
