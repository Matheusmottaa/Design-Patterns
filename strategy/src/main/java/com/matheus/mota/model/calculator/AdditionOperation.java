package com.matheus.mota.model.calculator;

public class AdditionOperation implements OperationStrategy {

    @Override
    public void calculate(int x, int y) {
        System.out.println("The sum is: " + (x+y));
    }
}
