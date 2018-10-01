package hu.uni.miskolc.iit.swtest.calculator;

import hu.uni.miskolc.iit.swtest.calculator.controller.CalculatorController;
import hu.uni.miskolc.iit.swtest.calculator.core.Calculator;
import hu.uni.miskolc.iit.swtest.calculator.core.exceptions.DivideByZeroException;
import hu.uni.miskolc.iit.swtest.calculator.service.CalculatorImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    private static CalculatorController calculatorController;

    //This part should be change to Spring ApplicationContext based initialization.
    static {
        Calculator calculator = new CalculatorImpl();
        calculatorController = new CalculatorController(calculator);
    }

    public static void main( String[] args ) throws DivideByZeroException {
        System.out.println( "Hello World!" );
        System.out.println(calculatorController.calculate("5+3"));
    }
}
