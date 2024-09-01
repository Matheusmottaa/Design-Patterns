package com.matheus.mota.model;

import java.math.BigDecimal;

public class Buy implements BuyInfo{

    private String productName;
    BigDecimal totalAmount;

    public Buy(BigDecimal totalAmount, String productName) {
        this.totalAmount = totalAmount;
        this.productName = productName;
    }

    public void processBuy(PaymentStrategy paymentStrategy) {
        paymentStrategy.payment(this);
    }

    @Override
    public String getProduct() {
        return productName;
    }

    @Override
    public BigDecimal getAmount() {
        return totalAmount;
    }
}
