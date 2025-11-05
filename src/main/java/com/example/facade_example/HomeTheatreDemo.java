package com.example.facade_example;

public class HomeTheatreDemo {

    public static void main(String[] args) {
        // Without Facade - client must manage complexity
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();
        // Tedious manual setup
        lights.dim(10);
        projector.on();
        // ... requires 10 more steps ...

        // With Facade - simple interface
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, dvd, projector, lights);
        homeTheatre.watchMovie("Inception");
        homeTheatre.endMovie();
    }
}





