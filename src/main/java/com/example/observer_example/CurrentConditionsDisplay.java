package com.example.observer_example;

// Concrete Observers
class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;
  
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
  
    private void display() {
        System.out.println("Current conditions: " + temperature 
                         + "°C and " + humidity + "% humidity");
    }
}