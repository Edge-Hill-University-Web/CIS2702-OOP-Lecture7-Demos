package com.example.observer_example;

// Observer interface
interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
