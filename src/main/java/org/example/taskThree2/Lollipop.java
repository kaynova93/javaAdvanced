package org.example.taskThree2;

public class Lollipop extends Candy {
    String filling;

    public Lollipop(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() + "\nначинка = " + filling + "\n";
    }
}
