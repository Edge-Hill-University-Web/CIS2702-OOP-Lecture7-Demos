package com.example.observer_example;

// Usage
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
      
        // Create and register observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
      
        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);
      
        // Simulate weather changes
        System.out.println("\n--- First measurement ---");
        weatherStation.setMeasurements(23.0f, 65.0f, 1013.0f);
      
        System.out.println("\n--- Second measurement ---");
        weatherStation.setMeasurements(25.0f, 70.0f, 1014.0f);
      
        System.out.println("\n--- Removing statistics display ---");
        weatherStation.removeObserver(statisticsDisplay);
      
        System.out.println("\n--- Third measurement ---");
        weatherStation.setMeasurements(22.0f, 60.0f, 1012.0f);
    }
}