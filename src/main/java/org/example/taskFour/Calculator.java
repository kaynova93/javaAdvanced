package org.example.taskFour;

import lombok.Getter;
import org.example.taskFour.operators.Operation;


public class Calculator extends Operation{
    private static final String RESULT = "Итог = ";

    @Getter
    Double result;

    public Calculator(Double number1, Double number2) {
        super(number1, number2);
    }

    public Calculator(Double number1, Double number2, String operator) {
        super(number1, number2, operator);
    }

    /**
     * Метод для запуска калькулятора
     */
    public void calculate() {
       calc();
       System.out.printf(RESULT + "%.2f", result);
    }

    /**
     * Метод получает данные для работы калькулятора
     * оборачивает в интерфейс Sum
     * Проверяет переденную на вход операцию
     * Если операция есть, создает класс наследник и
     * @return результат операции
     */
    public void calc() {
        if (isOperation(operator)){
            result = result();
        }else {
            throw new CalculatorException("Ошибка. Такая операция не реализована.");
        }
    }

    /**
     * Проверка реализованных операций
     * @param operator - оператор
     * @return - true|false
     */
    public boolean isOperation(String operator){
        return operator.equals("+") || operator.equals("-")||operator.equals("*")||operator.equals("/");
    }
}
