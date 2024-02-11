package org.example.taskFour.operators.heirs;

import org.example.taskFour.operators.Operation;

public class Division extends Operation {
    private final String operator = "/";

    public Division(Double number1, Double number2) {
        super(number1, number2);

    }

    @Override
    public Double result() {
        return transformationNumber(number1, number2, operator);
    }

}
