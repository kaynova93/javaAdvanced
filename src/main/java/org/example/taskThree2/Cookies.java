package org.example.taskThree2;

public class Cookies extends Candy {
    String typeCookies;
    boolean gluten;

    public Cookies(String name, double weight, double price, String typeCookies, boolean gluten) {
        super(name, weight, price);
        this.typeCookies = typeCookies;
        this.gluten = gluten;
    }

    @Override
    public String toString() {
        return super.toString() + "\nтип печенья = " + typeCookies + "\nналичие глютена = " + gluten + "\n";
    }
}
