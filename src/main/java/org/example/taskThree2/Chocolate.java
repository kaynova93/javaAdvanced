package org.example.taskThree2;

public class Chocolate extends Candy {
    String typeChocolate;

    public Chocolate(String name, double weight, double price, String typeChocolate) {
        super(name, weight, price);
        this.typeChocolate = typeChocolate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nтип шоколада = " + typeChocolate + "\n";
    }
}
