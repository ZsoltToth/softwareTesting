package hu.uni.miskolc.iit.swtest.calculator.controller;

import hu.uni.miskolc.iit.swtest.calculator.core.Calculator;
import hu.uni.miskolc.iit.swtest.calculator.core.exceptions.DivideByZeroException;


public class CalculatorController {

    private enum Operators {
        PLUS('+'),
        MINUS('-'),
        PRODUCT('*'),
        DIVISION('/');

        private char operator;

        Operators(char operator) {
            this.operator = operator;
        }

        public char getOperator() {
            return operator;
        }
    }

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public double calculate(String expression) throws DivideByZeroException {
        double result = 0.0;
        if (expression.contains("" + Operators.PLUS.operator)) {
            String[] fields = expression.split("\\+");
            result = calculator.add(Double.parseDouble(fields[0]), Double.parseDouble(fields[1]));
        }
        if (expression.contains("" + Operators.MINUS.operator)) {
            String[] fields = expression.split("\\-");
            result = calculator.sub(Double.parseDouble(fields[0]), Double.parseDouble(fields[1]));
        }
        if (expression.contains("" + Operators.PRODUCT.operator)) {
            String[] fields = expression.split("\\*");
            result = calculator.mul(Double.parseDouble(fields[0]), Double.parseDouble(fields[1]));
        }
        if (expression.contains("" + Operators.DIVISION.operator)) {
            String[] fields = expression.split("\\/");

            result = calculator.div(Double.parseDouble(fields[0]), Double.parseDouble(fields[1]));

        }
        return result;
    }
}
