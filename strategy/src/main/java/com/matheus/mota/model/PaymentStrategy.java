package com.matheus.mota.model;

import java.math.BigDecimal;

@FunctionalInterface
public interface PaymentStrategy{
    void payment(BuyInfo buyInfo);
}
