package org.example.taskFour.parser;

import org.example.taskFour.operators.*;
import org.example.taskFour.operators.heirs.Addition;
import org.example.taskFour.operators.heirs.Division;
import org.example.taskFour.operators.heirs.Multiplication;
import org.example.taskFour.operators.heirs.Subtraction;

public class CalcParser {

    /**
     * Метод получает данные для работы калькулятора
     * @param x = первое число
     * @param operation = операцию
     * @param y = второе число
     * оборачивает в интерфейс Sum
     * Проверяет переденную на вход операцию
     * Если операция есть, создает класс наследник и
     * @return результат операции
     */
    public Sum parse(Double x , String operation, Double y) {
        Sum result = new ShellSum(x) ;
            if (isOperation(operation)){
                if(operation.equals("+")){
                    result = new Addition(x,y);
                }else if(operation.equals("-")){
                    result = new Subtraction(x,y);
                }else if(operation.equals("*")){
                    result = new Multiplication(x,y);
                }else{
                    result = new Division(x,y);
                }
            }else {
                System.out.println("Такой операции нет");
            }
        return result;
    }


    /**
     * Проверка реализованных операций
     * @param operand - оператор
     * @return - true|false
     */
    public boolean isOperation(String operand){
        return operand.equals("+") || operand.equals("-")||operand.equals("*")||operand.equals("/");
    }
}
