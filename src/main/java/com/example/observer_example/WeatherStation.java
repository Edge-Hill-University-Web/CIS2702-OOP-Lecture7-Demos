package com.example.observer_example;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject - the weather station
class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;
  
    public WeatherStation() {
        observers = new ArrayList<>();
    }
  
    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
        System.out.println("Observer registered");
    }
  
    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }
  
    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
  
    // Called when measurements change
    public void setMeasurements(float temp, float humid, float press) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = press;
        measurementsChanged();
    }
  
    private void measurementsChanged() {
        notifyObservers();
    }
  
    // Getters for pull model (if needed)
    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public float getPressure() { return pressure; }
}