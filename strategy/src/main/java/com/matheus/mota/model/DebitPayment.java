package com.matheus.mota.model;

import java.math.BigDecimal;

public class DebitPayment implements PaymentStrategy{

    @Override
    public void payment(BuyInfo buy) {
        System.out.println(String.format("Debit card payment, product: %s, amount: %.2f%n",
                buy.getProduct(), buy.getAmount()));
    }
}
