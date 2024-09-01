package com.matheus.mota.model.calculator;

@FunctionalInterface
public interface OperationStrategy {
    void calculate(int x, int y);
}
