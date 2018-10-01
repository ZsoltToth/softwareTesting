package hu.uni.miskolc.iit.swtest.calculator.service;

import hu.uni.miskolc.iit.swtest.calculator.core.Calculator;
import hu.uni.miskolc.iit.swtest.calculator.core.exceptions.DivideByZeroException;

public class CalculatorImpl implements Calculator {

    private static final double THRESHOLD  = 1e-4;

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) throws DivideByZeroException {
        if(Math.abs(b) < THRESHOLD){
            throw new DivideByZeroException(String.format("%d is below threshold", b));
        }
        return a/b;
    }
}
