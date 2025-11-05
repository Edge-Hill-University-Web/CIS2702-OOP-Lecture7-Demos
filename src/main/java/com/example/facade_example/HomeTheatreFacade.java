package com.example.facade_example;
// Facade - simplifies the complex subsystem
class HomeTheatreFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;

    public HomeTheatreFacade(Amplifier amp, DVDPlayer dvd,
            Projector projector, Lights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    // Simplified interface
    public void watchMovie(String movie) {
        System.out.println("\nGet ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down movie theatre...");
        dvd.stop();
        dvd.eject();
        dvd.off();
        amp.off();
        projector.off();
        lights.on();
    }
}