package org.example.taskThree2;

public class Candy {
    private String name;
    private double weight;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public Candy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Информация о конфете.
     * @return всю инф о конфете
     */
    @Override
    public String toString() {
        return "имя = " + name + "\nвес = " + weight + "\nцена = " + price;
    }
}
