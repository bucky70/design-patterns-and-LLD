package Facade;

public class Main {
    public static void main(String args[]){
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Light lights = new Light();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights);
        homeTheater.watchMovie("Inception");
        // Output:
        // Get ready to watch a movie...
        // Dimming lights to 10%
        // Projector is on
        // Setting projector input to DVD
        // Amplifier is on
        // Setting volume to 5
        // DVD Player is on
        // Playing movie: Inception

        homeTheater.endMovie();
        // Output:
        // Shutting down the home theater system...
        // Lights are on
        // Projector is off
        // Amplifier is off
        // DVD Player is off
    }
}
  