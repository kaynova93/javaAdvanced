package org.example.taskFour.operators;

import lombok.Getter;
import lombok.Setter;

public class Operation implements Sum {

    @Getter @Setter
    protected Double number1;
    @Getter @Setter
    protected Double number2;
    @Getter @Setter
    protected String operator;

    public Operation(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Operation(Double number1, Double number2,String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public Double result() {
        return transformationNumber();
    }

    /**
     * Метод определяет нужную операцию и возвращает результат.
     * @return - результат
     */
    protected Double transformationNumber() {

        Double result = operator.equals("+") ? addition() :
                operator.equals("-") ? subtraction() :
                        operator.equals("*") ? multiplication() :
                                division();
        return result;
    }

    /**
     * Метод сложения
     * @return Double
     */
    public Double addition(){
        return number1+number2;
    }
    /**
     * Метод вычитание
     * @return Double
     */
    public Double subtraction(){
        return number1-number2;
    }
    /**
     * Метод деление
     * @return Double
     */
    public Double division(){
        return number1/number2;
    }
    /**
     * Метод умножение
     * @return Double
     */
    public Double multiplication(){
        return number1*number2;
    }
}
