package hu.uni.miskolc.iit.swtest.calculator;

import hu.uni.miskolc.iit.swtest.calculator.controller.CalculatorController;
import hu.uni.miskolc.iit.swtest.calculator.core.Calculator;
import hu.uni.miskolc.iit.swtest.calculator.service.CalculatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsoleApplicationContext {

    @Bean("helloWorld")
    public String hello(){
        return "Hello World";
    }

    @Bean
    public CalculatorController calculatorController(){
        return new CalculatorController(calculator());
    }

    @Bean("calculator")
    public Calculator calculator(){
        return new CalculatorImpl();
    }
}
