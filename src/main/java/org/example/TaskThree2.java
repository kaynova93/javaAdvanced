package org.example;

import org.example.taskThree2.Candy;
import org.example.taskThree2.SweetGift;

public class TaskThree2 {

    /**
     * Объявление сущностей
     * вызов классов и методов для работы.
     */
    Candy chocolate = new Candy("Шоколад",100.00,275.90);
    Candy jellybean = new Candy("Мармелад",35.00,59.90);
    Candy cookies = new Candy("Печенье",500.00,149.50);
    Candy lollipop = new Candy("Леденец",200.00,99.99);
    Candy candy = new Candy("Конфета",500.00,340);
    Candy[] candies = {chocolate,jellybean,cookies, lollipop,candy};
    SweetGift sweetGift = new SweetGift(candies);
    public void run(){
        sweetGift.getInfoCandy();
        sweetGift.getWeight();
        sweetGift.getPrice();
    }
}