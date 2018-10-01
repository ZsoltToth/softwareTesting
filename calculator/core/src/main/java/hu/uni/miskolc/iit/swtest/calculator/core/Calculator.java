package hu.uni.miskolc.iit.swtest.calculator.core;

import hu.uni.miskolc.iit.swtest.calculator.core.exceptions.DivideByZeroException;

public interface Calculator {

    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b) throws DivideByZeroException;
}
