package com.matheus.mota.application;

import com.matheus.mota.model.CurrentConditionsDisplay;
import com.matheus.mota.model.StatisticsDisplay;
import com.matheus.mota.model.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(26.8, 13.3, 101.06);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


        System.out.println("\n");
        weatherData.setMeasurements(32.0, 8.4, 98.71);

        System.out.println("\nUnsubscribe currentConditionsDisplay\n");
        weatherData.removeObserver(currentConditionsDisplay);


        weatherData.setMeasurements(6.3, 18.0, 108.56);

    }
}