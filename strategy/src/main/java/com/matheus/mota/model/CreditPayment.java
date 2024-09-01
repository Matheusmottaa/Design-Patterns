package com.matheus.mota.model;

import java.math.BigDecimal;

public class CreditPayment implements PaymentStrategy{

    @Override
    public void payment(BuyInfo buy) {
        System.out.println(String.format("Credit card payment, product: %s, amount: %.2f%n",
                buy.getProduct(), buy.getAmount()));
    }
}
