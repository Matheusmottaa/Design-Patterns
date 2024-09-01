package com.matheus.mota.model.calculator;

public class MultiplciationOperation implements OperationStrategy {

    @Override
    public void calculate(int x, int y) {
        System.out.println("The mult is: " + (x*y));
    }
}
