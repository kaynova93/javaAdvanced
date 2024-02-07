package org.example;

import org.example.taskThree2.*;

public class TaskThree2 {
    /**
     * Объявление сущностей
     * вызов классов и методов для работы.
     */
    Chocolate chocolate = new Chocolate("Шоколад", 100.00, 275.90, "молочный");
    Chocolate chocolate2 = new Chocolate("Шоколад", 100.00, 275.90, "темный");
    Jellybean jellybean = new Jellybean("Мармелад", 35.00, 59.90, "кола");
    Jellybean jellybean2 = new Jellybean("Мармелад", 35.00, 59.90, "черника и малина со сливками");
    Cookies cookies = new Cookies("Печенье", 500.00, 149.50, "песочное", true);
    Cookies cookies2 = new Cookies("Печенье", 500.00, 349.50, "овсяное", false);
    Lollipop lollipop = new Lollipop("Леденец", 12.00, 29.99, "жидкая карамель");
    Lollipop lollipop2 = new Lollipop("Леденец", 15.00, 39.99, "жевательная резинка");
    Candy[] candies = {chocolate, chocolate2, jellybean, jellybean2, cookies, cookies2, lollipop, lollipop2};
    SweetGift sweetGift = new SweetGift(candies);

    public void run() {
        sweetGift.getInfoCandy();
        sweetGift.getWeight();
        sweetGift.getPrice();
    }
}