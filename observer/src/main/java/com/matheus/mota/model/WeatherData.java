package com.matheus.mota.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private Double temperature;
    private Double humidity;
    private Double pressure;

    private List<Observer> observers = new ArrayList<>();

    public WeatherData() {}

    public WeatherData(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public void measurementsChanged() {
        notifyObservers();
    }
}
