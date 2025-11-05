package com.example.facade_example;

// Complex subsystem classes
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }

    public void eject() {
        System.out.println("DVD ejected");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}
