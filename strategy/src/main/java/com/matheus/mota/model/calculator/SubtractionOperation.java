package com.matheus.mota.model.calculator;

public class SubtractionOperation implements OperationStrategy {
    public void calculate(int x, int y) {
        System.out.println("The sub is: " + (x-y));
    }
}
