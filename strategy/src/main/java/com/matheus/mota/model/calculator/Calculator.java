package com.matheus.mota.model.calculator;

public class Calculator {

    private Integer number1;
    private Integer number2;

    public Calculator(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void getResult(OperationStrategy operation) {
        operation.calculate(number1, number2);
    }

}
