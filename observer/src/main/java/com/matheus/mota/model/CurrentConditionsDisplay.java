package com.matheus.mota.model;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private Double temperature;
    private Double humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condtions: " + temperature + " C degress and " + humidity + "% humidity");
    }

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
