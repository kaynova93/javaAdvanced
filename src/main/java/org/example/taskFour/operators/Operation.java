package org.example.taskFour.operators;

public class Operation implements Sum {

    protected final Double number1;
    protected final Double number2;
    protected String operator;

    public Operation(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double result() {
        return transformationNumber(number1, number2, operator);
    }

    /**
     * Метод определяет нужную операцию и возвращает результат.
     * @param x - число 1
     * @param y - число 2
     * @param operator - оператор
     * @return - результат
     */
    protected Double transformationNumber(Double x, Double y, String operator) {

        Double result = operator.equals("+") ? x + y :
                operator.equals("-") ? x - y :
                        operator.equals("*") ? x * y :
                                x / y;
        return result;

    }
}
