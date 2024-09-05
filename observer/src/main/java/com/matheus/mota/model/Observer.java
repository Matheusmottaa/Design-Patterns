package com.matheus.mota.model;

public interface Observer {
    void update(Double temperature, Double humidity, Double pressure);
}
