package org.example.taskFour;

import lombok.Getter;
import lombok.Setter;
import org.example.taskFour.operators.Operation;


public class Calculator extends Operation{
    private static final String RESULT = "Итог = ";
    @Getter
    String error;
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
       if (result!= null) {
           System.out.printf(RESULT + "%.2f", result);
       }else{
           System.out.printf(RESULT + error);
       }

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
            //  Operation operation = new Operation(getNum1(),getNum2(),getOperator());
            result = result();
        }else {
            error = "Ошибка. Такой операции нет";
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
