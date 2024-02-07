package org.example.taskThree2;

public class Jellybean extends Candy {
    String taste;

    public Jellybean(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + "\nвкус = " + taste + "\n";
    }

}
