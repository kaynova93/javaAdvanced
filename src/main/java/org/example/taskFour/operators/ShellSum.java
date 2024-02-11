package org.example.taskFour.operators;

public class ShellSum implements Sum {

    private final Double number;

    public ShellSum(Double number) {
        this.number = number;
    }

    @Override
    public Double result() {
        return number;
    }
}
