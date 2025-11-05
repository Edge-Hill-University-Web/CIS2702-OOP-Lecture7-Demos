package com.example.facade_example;

class Amplifier {

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDVD(DVDPlayer dvd) { System.out.println("Amplifier set to DVD"); }

    public void setSurroundSound() { System.out.println("Surround sound on"); }

    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}