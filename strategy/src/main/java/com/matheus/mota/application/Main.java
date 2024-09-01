package com.matheus.mota.application;

import com.matheus.mota.model.Buy;
import com.matheus.mota.model.CreditPayment;
import com.matheus.mota.model.PixPayment;
import com.matheus.mota.model.calculator.Calculator;
import com.matheus.mota.model.calculator.MultiplciationOperation;
import com.matheus.mota.model.calculator.SubtractionOperation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Buy shoppingBuy = new Buy(BigDecimal.valueOf(3780.0), "Macbook pro M2");
        shoppingBuy.processBuy(new CreditPayment());
        shoppingBuy.processBuy(new PixPayment());
        shoppingBuy.processBuy(x -> System.out.println("Check payment"));

        System.out.println("\n==========================================================\n");

        Calculator calc = new Calculator(4,5);
        calc.getResult(new MultiplciationOperation());
        calc.getResult(new SubtractionOperation());
        calc.getResult((x,y) -> {
            System.out.println("The pow is: " + Math.pow(x,y));
        });
    }
}
