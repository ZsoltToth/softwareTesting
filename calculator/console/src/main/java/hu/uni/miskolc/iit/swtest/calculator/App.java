package hu.uni.miskolc.iit.swtest.calculator;

import hu.uni.miskolc.iit.swtest.calculator.controller.CalculatorController;
import hu.uni.miskolc.iit.swtest.calculator.core.Calculator;
import hu.uni.miskolc.iit.swtest.calculator.core.exceptions.DivideByZeroException;
import hu.uni.miskolc.iit.swtest.calculator.service.CalculatorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws DivideByZeroException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConsoleApplicationContext.class);
        CalculatorController calculatorController = (CalculatorController) context.getBean("calculatorController");
        System.out.println(context.getBean("helloWorld"));

        System.out.println(calculatorController.calculate("5+3"));
    }
}
