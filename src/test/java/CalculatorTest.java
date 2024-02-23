import org.example.taskFour.Calculator;
import org.example.taskFour.CalculatorException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class CalculatorTest {
    Double num1 = Math.round((1 + (100 - 1) * new Random().nextDouble()) * 100.0) / 100.0;
    Double num2 = Math.round((1 + (100 - 1) * new Random().nextDouble()) * 100.0) / 100.0;
    Double zero = 0.0;
    String negativeOperator = ".";



    /**
     * тест на сложение c положительными  числами
     */
    @Test
    public void calculatedAdditionPositiveNumbers(){
        Calculator calculator = new Calculator(num1, num2);
        Assert.assertEquals(calculator.addition(),num1+num2,0);
    }
    /**
     * тест на сложение c отрицательными  числами
     */
    @Test
    public void calculatedAdditionNegativeNumbers(){
        Calculator calculator = new Calculator(-num1, -num2);
        Assert.assertEquals(calculator.addition(),-num1+-num2,0);
    }

    /**
     * тест на вычитание c положительными  числами
     */
    @Test
    public void calculatedSubtractionPositiveNumbers(){
        Calculator calculator = new Calculator(num1, num2);
        Assert.assertEquals(calculator.subtraction(),num1-num2,0);
    }
    /**
     * тест на вычитание c отрицательными числами
     */
    @Test
    public void calculatedSubtractionNegativeNumbers(){
        Calculator calculator = new Calculator(-num1, -num2);
        Assert.assertEquals(calculator.subtraction(),(-num1)-(-num2),0);
    }

    /**
     * тест на умножение c положительными  числами
     */
    @Test
    public void calculatedMultiplicationPositiveNumbers(){
        Calculator calculator = new Calculator(num1, num2);
        Assert.assertEquals(calculator.multiplication(),num1*num2,0);
    }

    /**
     * тест на умножение c отрицательными числами
     */
    @Test
    public void calculatedMultiplicationNegativeNumbers(){
        Calculator calculator = new Calculator(-num1, -num2);
        Assert.assertEquals(calculator.multiplication(),(-num1)*(-num2),0);
    }

    /**
     * тест на деление c положительными  числами
     */
    @Test
    public void calculatedDivisionPositiveNumbers(){
        Calculator calculator = new Calculator(num1, num2);
        Assert.assertEquals(calculator.division(),num1/num2,0);
    }

    /**
     * тест на деление c отрицательными числами
     */
    @Test
    public void calculatedDivisionNegativeNumbers(){
        Calculator calculator = new Calculator(-num1, -num2);
        Assert.assertEquals(calculator.division(),(-num1)/(-num2),0);
    }

    /**
     * тест деление на ноль, проверка исключения
     */
    @Test(expected = ArithmeticException.class)
    public void calculatedDivisionZero(){
        Calculator calculator = new Calculator(num1, zero);
        calculator.division();
    }

    /**
     * тест на некоррекный оператор
     */
   @Test(expected = CalculatorException.class)
    public void calculatedNegativeOperator(){
        Calculator calculator = new Calculator(2.0,6.0);
        calculator.calc(negativeOperator);
    }

}