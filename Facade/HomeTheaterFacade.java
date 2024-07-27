package Facade;
class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Light lights;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Light lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater system...");
        lights.dim(100);
        projector.on();
        amp.on();
        dvd.on();
    }
}
