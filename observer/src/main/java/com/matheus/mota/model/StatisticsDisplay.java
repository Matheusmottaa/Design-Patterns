package com.matheus.mota.model;

public class StatisticsDisplay implements Observer, DisplayElement{

    private Double temperature;

    private Double humidity;

    private Double pressure;

    private WeatherData weatherData;

    public StatisticsDisplay() {}

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        weatherData.measurementsChanged();
    }

    @Override
    public void display() {
        System.out.println("Statistics Display: Temperature: " + temperature + " C and humidity: "
                + humidity + "% humidity and pressure: " +  pressure + " N.");
    }

    @Override
    public void update(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
